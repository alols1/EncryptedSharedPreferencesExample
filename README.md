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