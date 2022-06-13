package com.aep.LeBanquet.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.LeBanquet.domain.Endereco;

@RestController
@RequestMapping("/endereco")
public class EnderecoResource extends CrudResource<Endereco> {

}
