package com.mj.repository;

import org.springframework.data.repository.CrudRepository;

import com.mj.entity.BankOpening;

public interface BankRepository extends CrudRepository<BankOpening, Long> {

}
