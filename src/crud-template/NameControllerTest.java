package $package$.controller;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import $package$.dto.$Model$Dto;
import $package$.helper.$Model$TestHelper;
import $package$.helper.TestHelper;
import $package$.model.$Model$;
import $package$.service.CrudService;
import $package$.service.$Model$Service;

public class $Model$ControllerTest extends CrudControllerTest<$Model$, $Model$Dto> {

    @InjectMocks
    $Model$Controller $model$Controller;

    @Mock
    private $Model$Service service;

    private TestHelper<$Model$> helper = new $Model$TestHelper();

    @Override
    protected CrudService<$Model$> getService() {
        return service;
    }

    @Override
    public String getEndPoint() {
        return $Model$Controller.ENDPOINT;
    }

    @Override
    public BaseCrudController<$Model$, $Model$Dto> getController() {
        return $model$Controller;
    }

    @Override
    public TestHelper<$Model$> getTestHelperImpl() {
        return helper;
    }

}