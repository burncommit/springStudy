package com.example.fruit.service;

import com.example.fruit.data.dto.FruitDto;
import com.example.fruit.data.entity.FruitEntity;
import com.example.fruit.data.mapper.FruitMapper;
import com.example.fruit.data.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {
    private final FruitRepository fruitRepository;
    private final FruitMapper fruitMapper;

    @Autowired
    public FruitService(FruitRepository fruitRepository, FruitMapper fruitMapper){
        this.fruitRepository = fruitRepository;
        this.fruitMapper = fruitMapper;
    }

    public FruitEntity createFruit(FruitDto fruitDto){
        FruitEntity fruitEntity = fruitMapper.toEntity(fruitDto);
        return fruitRepository.save(fruitEntity);
    }
    public List<FruitEntity> getAllFruit(){
        return fruitRepository.findAll();
    }
    public FruitEntity getFruitById(int fruitId){
        return fruitRepository.findById(fruitId).orElse(null);
    }
    public FruitEntity updateFruit(int fruitId, FruitDto fruitDto){
        FruitEntity existFruit = fruitRepository.findById(fruitId).orElse(null);
        if(existFruit != null){
            FruitEntity updateFruit = fruitMapper.toEntity(fruitDto);
            updateFruit.setFruitId(fruitId);
            return fruitRepository.save(updateFruit);
        }
        return null;
    }
    public void deleteFruit(int fruitId){
        fruitRepository.deleteById(fruitId);
    }
}
