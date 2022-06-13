package com.aep.LeBanquet.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.LeBanquet.domain.Item;

@RestController
@RequestMapping("/item")
public class ItemResource extends CrudResource<Item>{

}
