package com.example.springmysqljparest.repository;

import com.example.springmysqljparest.model.Llibre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LlibreRepository extends JpaRepository<Llibre, String> {

}