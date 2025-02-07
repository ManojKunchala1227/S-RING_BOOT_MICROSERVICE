package com.mj.repo;

import org.springframework.data.repository.CrudRepository;

import com.mj.entity.Traveller;

public interface TravellerRepository extends CrudRepository<Traveller, Integer>{

}
