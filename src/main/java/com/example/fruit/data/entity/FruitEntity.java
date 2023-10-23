package com.example.fruit.data.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Fruit")
public class FruitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fruitId;
    private String fruitName;
    private int fruitWeight;


}
