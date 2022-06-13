package com.aep.LeBanquet.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.LeBanquet.domain.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteResource extends CrudResource<Cliente> {

}
