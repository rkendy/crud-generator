package $package$.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.mockito.InjectMocks;

import $package$.helper.$Model$TestHelper;
import $package$.helper.TestHelper;
import $package$.model.$Model$;
import $package$.service.impl.$Model$ServiceImpl;

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