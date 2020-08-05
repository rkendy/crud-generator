package $package$.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.data.repository.CrudRepository;

import $package$.helper.$Model$TestHelper;
import $package$.helper.TestHelper;
import $package$.model.$Model$;
import $package$.repository.$Model$Repository;
import $package$.service.impl.$Model$ServiceImpl;

public class $Model$ServiceTest extends CrudServiceTest<$Model$> {

    @InjectMocks
    private $Model$ServiceImpl service;

    @Mock
    private $Model$Repository repository;

    private TestHelper<$Model$> helper = new $Model$TestHelper();

    @Override
    protected CrudService<$Model$> getServiceImpl() {
        return service;
    }

    @Override
    protected CrudRepository<$Model$, Long> getRepository() {
        return repository;
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