package com.aep.LeBanquet.resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.LeBanquet.domain.Categoria;

@CrossOrigin
@RestController
@RequestMapping("/categoria")
public class CategoriaResource extends CrudResource<Categoria> {

	
}
