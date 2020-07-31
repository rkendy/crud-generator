package com.example.crudgenerator.helper;

import java.util.List;

public interface TestHelper<MODEL> {

    MODEL createOne();

    Long getId(MODEL model);

    String convertToJson(MODEL model);

    List<MODEL> createList();

}