package com.example.crudgenerator.helper;

import java.util.List;

import com.example.crudgenerator.util.MapperUtil;

public interface TestHelper<MODEL> {

    MapperUtil mapperUtil = new MapperUtil();

    MODEL createOne();

    Long getId(MODEL model);

    String convertToJson(MODEL model);

    List<MODEL> createList();

}