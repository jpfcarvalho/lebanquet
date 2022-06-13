package com.aep.LeBanquet.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.LeBanquet.domain.ItensPedido;

@RestController
@RequestMapping("/itens-pedido")
public class ItensPedidoResource extends CrudResource<ItensPedido> {

}
