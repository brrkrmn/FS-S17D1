package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workintech/animal")
public class AnimalController {
    private Map<Integer, Animal> animals = new HashMap<>();

    @GetMapping
    public List<Animal> get() {
        return animals.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Animal get(@PathVariable Integer id) {
        return animals.get(id);
    }

    @PostMapping
    public void create(@RequestBody Animal animal) {
        animals.put(animal.getId(), animal);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody Animal animal) {
        animals.get(id).setId(animal.getId());
        animals.get(id).setName(animal.getName());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        animals.remove(id);
    }
}
