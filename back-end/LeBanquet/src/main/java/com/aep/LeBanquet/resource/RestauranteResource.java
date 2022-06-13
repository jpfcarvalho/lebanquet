package com.aep.LeBanquet.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.LeBanquet.domain.Restaurante;

@RestController
@RequestMapping("/restaurante")
public class RestauranteResource extends CrudResource<Restaurante> {

}
