# AndroidLOVException
Library for avoid force close when your application is running and will be taken to a new activity for showing error message
# Usage

1. Import the library into your project.
  * Grab via maven

    ```xml
    <dependency>
        <groupId>com.alandwiprasetyo.androidlovexception</groupId>
        <artifactId>androidlovexception</artifactId>
        <version>1.0.1</version>
        <type>pom</type>
    </dependency>
    ```

  * Grab via gradle

    ```groovy
    compile 'com.alandwiprasetyo.androidlovexception:androidlovexception:1.0.1'
    ```

2. Add repository on your gradle.
    ```groovy
    repositories {
        maven {
            url  "http://dl.bintray.com/alandwiprasetyo/AndroidLovException"
        }
    }
    ```

3. Write the following code in your java file.
    ```java
    AndroidLovException.init(this);
    ```
    Or you want to custom Activity class for showing error message
    ```java
    AndroidLovException.init(this, ExceptionActivity.class);
    ```
    Example :
    ```java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidLovException.init(this);
        setContentView(R.layout.activity_main);
    }
    ```
# To do
  * support for Application Class

# Change Log

**Version 1.0.1**

* Add custom activity exception

**Version 1.0.0**

* Make class for handler exception

# License

    Copyright 2016 Alan Dwi Prasetyo

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
