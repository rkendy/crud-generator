package com.example.crudgenerator.util;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.hibernate.collection.spi.PersistentCollection;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class MapperUtil {
    private ModelMapper modelMapper;
    private ObjectMapper objectMapper;

    public MapperUtil() {
        objectMapper = new ObjectMapper();
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setPropertyCondition(context -> !(context.getSource() instanceof PersistentCollection));
    }

    public <D> D convertToDto(Object bean, Class<D> dto) {
        return modelMapper.map(bean, dto);
    }

    public <B, D> List<D> convertToDtoList(List<B> list, Class<D> dto) {
        return list.stream().map(e -> convertToDto(e, dto)).collect(Collectors.toList());
    }

    public <B> B convertToEntity(Object dto, Class<B> bean) { // throws ParseException {
        return modelMapper.map(dto, bean);
    }

    public String convertToJson(Object obj) {
        String result = "";
        try {
            result = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
        }
        return result;
    }

    public <D> D convertFromJson(String json, Class<D> bean) {
        try {
            return objectMapper.readValue(json, bean);
        } catch (Exception e) {
        }
        return null;
    }

}