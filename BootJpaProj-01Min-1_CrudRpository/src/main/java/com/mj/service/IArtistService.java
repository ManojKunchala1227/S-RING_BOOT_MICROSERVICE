package com.mj.service;

import java.util.List;
import java.util.Optional;

import com.mj.entity.Artist;

public interface IArtistService 
{
	public String registerArtist(Artist art);
	public  boolean checkAvailability(int id);
	public long showArtist();
	public String addMore(List<Artist> art);
	
	public Iterable<Artist> findAll();
	
	
	public Iterable<Artist> findAllById(Iterable<Integer> id);
	
	public Optional<Artist> opArtFindById(Integer ids);
	
	public String deleteByid(Integer id);
	
	public String deleteAllByid(Iterable <Integer> ids);
	
	
	
	
}
