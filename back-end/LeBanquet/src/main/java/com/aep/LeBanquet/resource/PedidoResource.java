package com.aep.LeBanquet.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.LeBanquet.domain.Pedido;

@RestController
@RequestMapping("/pedido")
public class PedidoResource extends CrudResource<Pedido> {

}
