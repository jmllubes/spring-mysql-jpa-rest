package com.example.springmysqljparest.repository;

import com.example.springmysqljparest.model.Usuari;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariRepository extends JpaRepository<Usuari, String> {
}