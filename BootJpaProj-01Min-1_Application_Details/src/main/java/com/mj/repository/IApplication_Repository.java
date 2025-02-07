package com.mj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mj.enetity.Application_Details;

public interface IApplication_Repository extends JpaRepository<Application_Details,Integer > 
{

}
