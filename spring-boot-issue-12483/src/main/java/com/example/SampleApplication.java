package com.example;

import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class SampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SampleApplication.class, args);
        MapperSample mapperSample = context.getBean(MapperSample.class);
        System.out.println(mapperSample.testMap());
    }

    @Bean
    public DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean(
            @Value("classpath*:/META-INF/dozer/**/*-mapping.xml") Resource[] resources) {
        final DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean
                = new DozerBeanMapperFactoryBean();
        dozerBeanMapperFactoryBean.setMappingFiles(resources);
        return dozerBeanMapperFactoryBean;
    }
}
