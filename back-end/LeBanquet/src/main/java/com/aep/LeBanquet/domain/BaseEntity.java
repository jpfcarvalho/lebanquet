package com.aep.LeBanquet.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface BaseEntity {

	Long getId();
	
	void setId(Long id);
	
	@JsonIgnore
	default boolean isNew() { return getId() == null;}
}
