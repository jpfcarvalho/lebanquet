package com.aep.LeBanquet.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.aep.LeBanquet.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	Page<Cliente> findByNomeIgnoreCaseContaining(String nome, Pageable pageable);
	
}
