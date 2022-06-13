package com.aep.LeBanquet.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.LeBanquet.domain.Pagamento;

@RestController
@RequestMapping("/pagamento")
public class PagamentoResource extends CrudResource<Pagamento> {

}
