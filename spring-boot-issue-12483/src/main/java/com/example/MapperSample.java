package com.example;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MapperSample {

    @Autowired
    Mapper mapper;

    public SampleDestinationBean testMap(){
        SampleSourceBean sampleSourceBean = new SampleSourceBean();
        return mapper.map(sampleSourceBean, SampleDestinationBean.class);
    }
}
