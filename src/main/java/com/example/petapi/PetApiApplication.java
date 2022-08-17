package com.example.petapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

    /*
* Class Task:
one controller that manages the list of pets
CRUD operation for Pet
pet can contain (name, age, type, owner Name) and any other information
It should follow http Request types e.g.:
POST for creating pet and
GET for showing pet list,
PUT for updating pet and
DELETE for removing pet*/

@SpringBootApplication
public class PetApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetApiApplication.class, args);
    }
}
