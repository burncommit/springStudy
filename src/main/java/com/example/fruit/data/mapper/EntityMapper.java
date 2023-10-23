package com.example.fruit.data.mapper;

public interface EntityMapper <DTO, Entity>{
    Entity toEntity(DTO dto);

}
