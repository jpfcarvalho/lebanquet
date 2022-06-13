package com.aep.LeBanquet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aep.LeBanquet.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
