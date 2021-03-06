package com.example.crudgenerator.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.example.crudgenerator.exception.NotFoundException;

import org.springframework.data.repository.CrudRepository;

public abstract class BaseCrudService<MODEL> {

    private CrudRepository<MODEL, Long> repository;
    private Class<?> modelClass;

    public void setRepository(CrudRepository<MODEL, Long> repository) {
        this.repository = repository;
    }

    public void setModelClass(Class<?> modelClass) {
        this.modelClass = modelClass;
    }

    public MODEL create(MODEL model) {
        return repository.save(model);
    }

    public void delete(Long id) {
        MODEL toDelete = repository.findById(id).orElseThrow(() -> new NotFoundException(modelClass, id));
        repository.delete(toDelete);
    }

    public List<MODEL> findAll() {
        List<MODEL> result = new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }

    public List<MODEL> findByFilter(MODEL filter) {
        return null;
    }

    public MODEL findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException(modelClass, id));
    }

    public MODEL update(Long id, Function<MODEL, MODEL> updateAttributes) {
        MODEL toUpdate = repository.findById(id).orElseThrow(() -> new NotFoundException(modelClass, id));
        toUpdate = updateAttributes.apply(toUpdate);
        return repository.save(toUpdate);
    }

}