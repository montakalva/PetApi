package com.example.petapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@AllArgsConstructor
@Data
public class Pet {

    private int id;
    private String petType;
    private String petName;
    private int age;
    private String ownerName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Pet() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public Pet(int id, String petType, String petName, int age, String ownerName) {
        this.id = id;
        this.petType = petType;
        this.petName = petName;
        this.age = age;
        this.ownerName = ownerName;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}
