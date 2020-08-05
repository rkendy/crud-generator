package $package$.controller;

import org.mockito.InjectMocks;

import $package$.dto.$Model$Dto;
import $package$.helper.$Model$TestHelper;
import $package$.helper.TestHelper;
import $package$.model.$Model$;

public class $Model$ControllerTest extends CrudControllerTest<$Model$, $Model$Dto> {

    @InjectMocks
    $Model$Controller $model$Controller;

    private TestHelper<$Model$> helper = new $Model$TestHelper();

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