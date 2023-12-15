package com.example.springmysqljparest.controller;

import com.example.springmysqljparest.model.Llibre;
import com.example.springmysqljparest.repository.LlibreRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LlibreController {

    private LlibreRepository repository;

    public LlibreController(LlibreRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/llibres")
    public List<Llibre> findAll() {
        return repository.findAll();
    }

    @PostMapping("/llibres")
    public Llibre newLlibre(@RequestBody Llibre llibre) {
        return repository.save(llibre);
    }

    @GetMapping("/llibres/{isbn}")
    public Llibre findOne(@PathVariable String isbn) {
        return repository.findById(isbn)
                .orElseThrow(() -> new LlibreNotFoundException(isbn));
    }



}
