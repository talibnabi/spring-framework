package com.company.swaggerApp.controller;


import com.company.swaggerApp.dto.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/pets")
public class PetController {
    private List<Pet> pets = new ArrayList<>();

    @PostMapping("/add")
    public ResponseEntity<Pet> addPet(@RequestBody Pet pet) {
        pets.add(pet);
        return ResponseEntity.ok(pet);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Pet>> getAllPet() {
        return ResponseEntity.ok(pets);
    }
}
