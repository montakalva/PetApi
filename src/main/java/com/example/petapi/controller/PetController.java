package com.example.petapi.controller;

import com.example.petapi.entity.Pet;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PetController {

    private final ArrayList<Pet> petList = new ArrayList<>();

    @PostMapping("/api/createPet")
    public Pet createPet(@RequestBody() Pet petRequest){
        Pet pet = new Pet(
                petRequest.getId(),
                petRequest.getPetType(),
                petRequest.getPetName(),
                petRequest.getAge(),
                petRequest.getOwnerName()
        );
        this.petList.add(pet);

        return pet;
    }

    @GetMapping("/api/viewPet")
    public ArrayList<Pet> viewPet(){
        return petList;
    }

    @GetMapping("/api/viewPet/{id}")
    public Pet findPetById(@PathVariable int id){
        for(Pet pets : petList){
            if(pets.getId()==id){
                return pets;
            }
        }
        return null;
    }

    @PutMapping("/api/updatePet/{id}")
    public ArrayList<Pet> UpdatePet(@PathVariable int id, @RequestBody() Pet petUpdate){
        for(Pet pets : petList){
            if (pets.getId()==id){
                pets.setPetType(petUpdate.getPetType());
                pets.setPetName(petUpdate.getPetName());
                pets.setAge(petUpdate.getAge());
                pets.setOwnerName(petUpdate.getOwnerName());
            }
        }
        return petList;
    }

    @DeleteMapping("/apt/deletePet/{id}")
    public ArrayList<Pet> DeletePet(@PathVariable int id){
        for(Pet petDelete : petList){
            if(petDelete.getId()==id){
                petList.remove(petDelete);
                break;
            }
        }
        return petList;
    }
}
