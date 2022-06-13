package com.aep.LeBanquet.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.LeBanquet.domain.Cardapio;

@RestController
@RequestMapping("/cardapio")
public class CardapioResource extends CrudResource<Cardapio>{

}
