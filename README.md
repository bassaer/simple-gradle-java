# simple-gradle-java

download gradle
```
$ wget https://services.gradle.org/distributions/gradle-4.8.1-bin.zip

$ sudo mkdir /opt/gradle

$ sudo unzip -d /opt/gradle gradle-4.8.1-bin.zip

$ export PATH=$PATH:/opt/gradle/gradle-4.8.1/bin

$ gradle

Welcome to Gradle 4.8.1!
....

$ gradle run

> Task :run
Hello World

BUILD SUCCESSFUL in 1s
2 actionable tasks: 1 executed, 1 up-to-date
```
