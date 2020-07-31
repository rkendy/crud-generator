package $package$.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import $package$.dto.$Model$Dto;
import $package$.model.$Model$;

@RestController
@RequestMapping($Model$Controller.ENDPOINT)
public class $Model$Controller extends BaseCrudController<$Model$, $Model$Dto> {

    public static final String ENDPOINT = "/api/$model$";

    @Override
    protected Class<$Model$Dto> getDtoClass() {
        return $Model$Dto.class;
    }

    @Override
    protected Class<$Model$> getModelClass() {
        return $Model$.class;
    }

}