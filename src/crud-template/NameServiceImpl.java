package $package$.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import $package$.model.$Model$;
import $package$.service.BaseCrudService;
import $package$.service.$Model$Service;
import $package$.repository.$Model$Repository;

@Service
public class $Model$ServiceImpl extends BaseCrudService<$Model$> implements $Model$Service {

    private $Model$Repository repository;

    @Autowired
    public $Model$ServiceImpl($Model$Repository repository) {
        this.repository = repository;
        super.setRepository(repository);
        super.setModelClass($Model$.class);
    }

    @Override
    protected void updateAttributes($Model$ to, $Model$ from) {
        to.setX(from.getX());
        to.setY(from.getY());
    }

}