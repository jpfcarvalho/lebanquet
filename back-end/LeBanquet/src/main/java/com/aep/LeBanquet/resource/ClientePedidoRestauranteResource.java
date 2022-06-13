package com.aep.LeBanquet.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.LeBanquet.domain.ClientePedidoRestaurante;

@RestController
@RequestMapping("/cliente-pedido-restaurante")
public class ClientePedidoRestauranteResource extends CrudResource<ClientePedidoRestaurante> {

}
