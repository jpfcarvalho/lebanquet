package com.aep.LeBanquet.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.LeBanquet.domain.TipoItem;

@RestController
@RequestMapping("/tipo-item")
public class TipoItemResource extends CrudResource<TipoItem> {

}
