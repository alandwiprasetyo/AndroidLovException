package com.alandwiprasetyo.androidlovexception;

import android.content.Context;
import android.content.Intent;
import android.os.Process;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by alandwiprasetyo on 10/20/16.
 */

public class AndroidLovException implements Thread.UncaughtExceptionHandler {
    private final Context context;
    private Class<?> intent;
    private Throwable errorMessage;
    private StringWriter stackTrace;

    public AndroidLovException(Context context, Class<?> intent) {
        this.context = context;
        this.intent = intent;
    }

    public static void init(Context context, Class<?> intentClass) {
        Thread.setDefaultUncaughtExceptionHandler(new AndroidLovException(context, intentClass));
    }

    public static void init(Context context) {
        Thread.setDefaultUncaughtExceptionHandler(new AndroidLovException(context, ExceptionActivity.class));
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {

        stackTrace = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stackTrace));
        setErrorMessage(throwable);
        printError();

        context.startActivity(new Intent(context, intent)
                .putExtra("exception", stackTrace.toString()).putExtra("message", throwable.getMessage()));
        killProcess();
    }

    public void printError() {
        System.err.println(stackTrace);
    }

    private void killProcess() {
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    public String getErrorMessage() {
        return errorMessage.toString();
    }

    public void setErrorMessage(Throwable errorMessage) {
        this.errorMessage = errorMessage;
    }
}