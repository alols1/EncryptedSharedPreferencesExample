EncyptedSharedPreferencesExample
======================

Sample Android project using Android Studio 0.8.0

It is meant to use my library, EncryptedSharedPreferences, remotely through gradle configuration.

The important parts are:

- General build.gradle:

```
 allprojects {
    repositories {
        jcenter()
        maven{
            url 'https://github.com/olivierg13/og-maven/raw/master/release/'
        }
    }
}
 ```
 
 - app build.gradle:
 
```
 dependencies {
    compile 'com.og.encryptedsharedpreferences:encryptedsharedpreferences:1.0.0@aar'
    compile fileTree(dir: 'libs', include: ['*.jar'])
}
```

======================

Testing for Android using Robotium and Spoon
-------
You will find under the directory app/src/androidTest some java testing using Robotium.
Robotium is derived from Junit, and allow to simply implement some instrumentation and unit testing!

There are two options to launch the tests:
- Simply click right on the folder to launch the Android tests, or do your own gradle target to run it with tests etc...
- Launch the spoon custom gradle task, which will use Spoon (from Square) to run the tests and publish a report at the end of it. By default, the report will be generated in the folder app/build/reports.

For more information about spoon, you can consult the website:
http://square.github.io/spoon/

======================

Quality for Android
-------
You will find under the directory /config the base configuration to run quality test on the project.
The followings tools are used:
 - Checkstyle.
 - Findbugs.
 - PMD.
 - Lint.
 
By default, all the reports will be generated in the folder app/build/reports.
 
======================

License

    Copyright 2013 Olivier Goutay.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.