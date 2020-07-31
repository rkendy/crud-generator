package com.example.crudgenerator.service.impl;

import org.springframework.stereotype.Service;

import com.example.crudgenerator.model.$Model$;
import com.example.crudgenerator.service.CrudService;

@Service
public class $Model$ServiceImpl extends CrudService<$Model$> {

    @Override
    protected Class<?> getModelClass() {
        return $Model$.class;
    }

    @Override
    protected void updateAttributes($Model$ toUpdate, $Model$ updated) {
        // toUpdate.setAtivo(updated.getAtivo());
        // toUpdate.setCodigo(updated.getCodigo());
        // toUpdate.setEmail(updated.getEmail());
        // toUpdate.setLotacao(updated.getLotacao());
        // toUpdate.setNome(updated.getNome());
    }

}