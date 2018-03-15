package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleApplicationWithoutBoot {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SampleApplicationConfig.class);
        MapperSample mapperSample = context.getBean(MapperSample.class);
        System.out.println(mapperSample.testMap());
    }
}
