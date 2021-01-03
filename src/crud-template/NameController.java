package $package$.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import $package$.dto.$Model$Dto;
import $package$.model.$Model$;
import $package$.service.CrudService;
import $package$.service.$Model$Service;

@RestController
@RequestMapping($Model$Controller.ENDPOINT)
public class $Model$Controller extends BaseCrudController<$Model$, $Model$Dto> {

    public static final String ENDPOINT = "/api/$model$";

    private $Model$Service service;

    @Autowired
    public $Model$Controller($Model$Service service) {
        this.service = service;
    }

    @Override
    protected CrudService<$Model$> getService() {
        return service;
    }

    @Override
    protected Class<$Model$Dto> getDtoClass() {
        return $Model$Dto.class;
    }

    @Override
    protected Class<$Model$> getModelClass() {
        return $Model$.class;
    }

}