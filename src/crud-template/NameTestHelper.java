package $package$.helper;

import java.util.List;

import org.springframework.stereotype.Component;

import $package$.dto.$Model$Dto;
import $package$.model.$Model$;
import $package$.helper.$Model$TestHelper;

@Component
public class $Model$TestHelper implements TestHelper<$Model$> {

    private $Model$ createOne(String a, String b) {
        return $Model$.builder().attributeA(a).atributeB(b).build();
    }

    @Override
    public $Model$ createOne() {
        return createOne("aaa", "bbb");
    }

    @Override
    public Long getId($Model$ model) {
        return model.getId();
    }

    @Override
    public String convertToJson($Model$ model) {
        $Model$Dto dto = mapperUtil.convertToDto(model, $Model$Dto.class);
        return mapperUtil.convertToJson(dto);
    }

    @Override
    public List<$Model$> createList() {
        return List.of( //
                createOne("aaa1", "bbb1"), //
                createOne("aaa2", "bbb2"));
    }

}