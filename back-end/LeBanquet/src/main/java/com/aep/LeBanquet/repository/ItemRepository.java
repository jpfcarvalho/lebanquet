package com.aep.LeBanquet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aep.LeBanquet.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
