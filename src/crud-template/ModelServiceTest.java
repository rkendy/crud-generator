package com.example.crudgenerator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.mockito.InjectMocks;

import com.example.crudgenerator.helper.$Model$TestHelper;
import com.example.crudgenerator.helper.TestHelper;
import com.example.crudgenerator.model.$Model$;
import com.example.crudgenerator.service.impl.$Model$ServiceImpl;

public class $Model$ServiceTest extends CrudServiceTest<$Model$> {

    @InjectMocks
    private $Model$ServiceImpl $Model$Service;

    private TestHelper<$Model$> helper = new $Model$TestHelper();

    @Override
    protected CrudService<$Model$> getServiceImpl() {
        return $Model$Service;
    }

    @Override
    protected TestHelper<$Model$> getTestHelperImpl() {
        return helper;
    }

    @Override
    protected void assertAttributes($Model$ expected, $Model$ actual) {
        // assertEquals(expected.getCodigo(), actual.getCodigo());
        // assertEquals(expected.getNome(), actual.getNome());
    }

}