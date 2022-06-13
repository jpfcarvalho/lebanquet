package com.aep.LeBanquet.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import com.aep.LeBanquet.domain.Categoria;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@Transactional
@Rollback
public class CategoriaServiceTest {

	@Autowired
	private CategoriaService service;
	
	@Test
	public void salvarCategoria() {
		
		Categoria entity = new Categoria(-1L, "Categoria teste", "teste");
		
		Categoria newEntity = service.save(entity);
		
		assertEquals(newEntity.getNome(), "Categoria teste");
		assertEquals(newEntity.getDescricao(), "teste");
		
		service.getRepository().deleteAll();
		
	}
	
	@Test
	public void BuscarTodasCategorias() {
		
		Categoria entity1 = new Categoria(-1L, "Categoria teste1", "teste1");
		Categoria entity2 = new Categoria(-1L, "Categoria teste2", "teste2");
		Categoria entity3 = new Categoria(-1L, "Categoria teste3", "teste3");
		
		service.getRepository().saveAll(List.of(entity1, entity2, entity3));
		
		Page<Categoria> entitys = service.findAll(Pageable.ofSize(2));
		
		assertEquals(entitys.getTotalElements(), 3L);
		assertEquals(entitys.getTotalPages(), 2);
		assertEquals(entitys.getContent().get(0).getNome(), "Categoria teste1");
		assertEquals(entitys.getContent().get(0).getDescricao(), "teste1");
		
		service.getRepository().deleteAll();
	}
	
	@Test
	public void DeletarCategoria() {
		
		Categoria entity = new Categoria(1L, "Categoria teste", "teste");
		service.getRepository().save(entity);
		
		List<Categoria> entitys = service.getRepository().findAll();
		assertEquals(entitys.size(), 1);
		
		service.deleteById(entitys.get(0).getId());
		
		entitys = service.getRepository().findAll();
		assertEquals(entitys.size(), 0);
	}
	
}
