package com.aep.LeBanquet.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.LeBanquet.domain.Garcom;

@RestController
@RequestMapping("/garcom")
public class GarcomResource extends CrudResource<Garcom> {

}
