package com.example.fruit.controller;

import com.example.fruit.data.dto.FruitDto;
import com.example.fruit.data.entity.FruitEntity;
import com.example.fruit.service.FruitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/fruit")
public class FruitController {
    private final FruitService fruitService;

    @GetMapping
    public List<FruitEntity> getFruit(){
        return fruitService.getAllFruit();
    }

    @GetMapping("/{fruitId}")
    public FruitEntity getFruit(@PathVariable int fruitId){
        return fruitService.getFruitById(fruitId);
    }
    @PostMapping
    public FruitEntity createFruit(@RequestBody FruitDto fruitDto){
        //FruitEntity createdFruit = fruitService.createFruit(fruitDto);
        return fruitService.createFruit(fruitDto);
    }

    @PutMapping("/{fruitId}")
    public FruitEntity updateFruit(@PathVariable int fruitId, @RequestBody FruitDto fruitDto){
        return fruitService.updateFruit(fruitId, fruitDto);
    }

    @DeleteMapping("/{fruitId}")
    public void deleteFruit(@PathVariable int fruitId){
        fruitService.deleteFruit(fruitId);
    }


}
