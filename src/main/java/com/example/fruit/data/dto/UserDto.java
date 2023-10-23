package com.example.fruit.data.dto;

import com.example.fruit.data.entity.FurnitureEntity;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class FurnitureDto {
    @Size(min = 2, max = 10)
    @NotNull(message = "이름은 필수 항목입니다.")
    private String fuName;

    @Size(min = 2, max = 10)
    @NotNull(message = "색상은 필수 항목입니다.")
    private String fuColor;

    @Min(value = 1000, message = "가격은 1000원이상 이어야 합니다")
    @Max(value = 5000000, message = "가격은 5,000,000원이하 이어야 합니다")
    private int fuPrice;

    public FurnitureEntity toEntity(){
        return FurnitureEntity.builder()
                .fuName(fuName)
                .fuColor(fuColor)
                .fuPrice(fuPrice)
                .build();
    }
}