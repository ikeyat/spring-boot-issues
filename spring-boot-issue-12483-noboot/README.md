## README.md

Repro of https://github.com/spring-projects/spring-boot/issues/12483

This app is packaged as a fat jar with ``maven-assembly-plugin`` instead of ``spring-boot-maven-plugin``.

```
$ mvn clean install
$ mvn exec:exec
```

The exception is never seen without Spring Boot and its repackage.