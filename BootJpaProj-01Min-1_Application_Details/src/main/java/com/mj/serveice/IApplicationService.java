package com.mj.serveice;

import java.util.Optional;

import com.mj.enetity.Application_Details;

public interface IApplicationService {
	public String registerAplication (Application_Details ad );
	public Optional<Application_Details> findbyid(int id);

	

}
