package com.example.fruit.data.dto;

import com.example.fruit.data.entity.FruitEntity;
import com.sun.istack.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class FruitDto {


    private String fruitName;
    private int fruitWeight;

    public FruitEntity toEntity(){
        return FruitEntity.builder()
                .fruitName(fruitName)
                .fruitWeight(fruitWeight)
                .build();
    }
}
