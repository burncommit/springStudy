package com.example.fruit.data.mapper;

import com.example.fruit.data.dto.FruitDto;
import com.example.fruit.data.entity.FruitEntity;
import org.springframework.stereotype.Component;

@Component
public class FruitMapper implements EntityMapper<FruitDto, FruitEntity> {
    @Override
    public FruitEntity toEntity(FruitDto fruitDto){
        FruitEntity fruitEntity = new FruitEntity();
        fruitEntity.setFruitName(fruitDto.getFruitName());
        fruitEntity.setFruitWeight(fruitDto.getFruitWeight());
        return fruitEntity;

    }

}
