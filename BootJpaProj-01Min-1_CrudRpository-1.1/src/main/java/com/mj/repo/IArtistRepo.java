package com.mj.repo;

import org.springframework.data.repository.CrudRepository;

import com.mj.entity.BankCostumer;

public interface IArtistRepo extends CrudRepository <BankCostumer, Long> {

}
