package com.mj.repository;

import org.springframework.data.repository.CrudRepository;

import com.mj.entity.BankCostumer;

public interface BankRepository extends CrudRepository<BankCostumer, Long>
{

}
