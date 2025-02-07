package com.mj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mj.entity.Traveller;

public interface TravellerRepository extends JpaRepository<Traveller, Integer> {

}
