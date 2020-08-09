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

    public $Model$ update(Long id, $Model$ model) {
        return super.update(id, (toUpdate) -> {
            // Update all attributes:
            toUpdate = model;
            toUpdate.setId(id);
            // Or select which attributes will be updated:
            // toUpdate.setA(model.getA());
            // toUpdate.setB(model.getB());
            return toUpdate;
        });
    }

}