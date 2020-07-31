package $package$.helper;

import java.util.List;

import org.springframework.stereotype.Component;

import $package$.dto.$Model$Dto;
import $package$.model.$Model$;
import $package$.util.MapperUtil;

@Component
public class $Model$TestHelper implements TestHelper<$Model$> {

    @Override
    public $Model$ createOne() {
        return $Model$.builder().build();
    }

    @Override
    public Long getId($Model$ model) {
        return model.getId();
    }

    @Override
    public String convertToJson($Model$ model) {
        $Model$Dto dto = MapperUtil.convertToDto(model, $Model$Dto.class);
        return MapperUtil.convertToJson(dto);
    }

    @Override
    public List<$Model$> createList() {
        return List.of( //
                $Model$.builder().build(), $Model$.builder().build());
    }

}