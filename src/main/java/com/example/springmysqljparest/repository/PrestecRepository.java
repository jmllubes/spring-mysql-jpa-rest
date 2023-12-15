package com.example.springmysqljparest.repository;

import com.example.springmysqljparest.model.Prestec;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestecRepository extends JpaRepository<Prestec, Integer> {
}