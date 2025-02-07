package com.mj.Repo;

import org.springframework.data.repository.CrudRepository;

import com.mj.entity.Artist;

public interface IArtistRepo extends CrudRepository<Artist, Integer>
{

}
