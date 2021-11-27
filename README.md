# simple-gradle-java
[![Java CI](https://github.com/bassaer/simple-gradle-java/actions/workflows/ci.yml/badge.svg)](https://github.com/bassaer/simple-gradle-java/actions/workflows/ci.yml)

## download gradle
```
$ wget https://services.gradle.org/distributions/gradle-4.8.1-bin.zip

$ sudo mkdir /opt/gradle

$ sudo unzip -d /opt/gradle gradle-4.8.1-bin.zip

$ export PATH=$PATH:/opt/gradle/gradle-4.8.1/bin

$ gradle

Welcome to Gradle 4.8.1!
....

```

## run
```
~/simple-gradle-java master* localhost.localdomain 6m 39s
❯ gradle build
Download https://repo.maven.apache.org/maven2/com/google/code/gson/gson/2.8.5/gson-2.8.5.pom
Download https://repo.maven.apache.org/maven2/com/google/code/gson/gson-parent/2.8.5/gson-parent-2.8.5.pom
Download https://repo.maven.apache.org/maven2/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar

BUILD SUCCESSFUL in 5s
5 actionable tasks: 5 executed

~/simple-gradle-java master* localhost.localdomain 6s
❯ gradle run

> Task :run
{"id":100,"name":"User1"}

BUILD SUCCESSFUL in 0s
2 actionable tasks: 1 executed, 1 up-to-date

```

## gradle wrapper
```
~/simple-gradle-java master localhost.localdomain
❯ gradle wrapper --gradle-version=4.8.1

BUILD SUCCESSFUL in 1s
1 actionable task: 1 executed

~/simple-gradle-java master* localhost.localdomain
❯ ./gradlew build
Downloading https://services.gradle.org/distributions/gradle-4.8.1-bin.zip
........................................................................

BUILD SUCCESSFUL in 2m 47s
5 actionable tasks: 5 up-to-date

~/simple-gradle-java master* localhost.localdomain 2m 48s
❯ ./gradlew run

> Task :run
{"id":100,"name":"User1"}

BUILD SUCCESSFUL in 0s
2 actionable tasks: 1 executed, 1 up-to-date

```
