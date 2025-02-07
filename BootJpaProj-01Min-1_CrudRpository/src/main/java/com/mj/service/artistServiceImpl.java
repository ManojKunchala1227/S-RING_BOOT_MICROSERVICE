package com.mj.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.Repo.IArtistRepo;
import com.mj.entity.Artist;


@Service("ArtistService")
public class artistServiceImpl implements IArtistService {
	@Autowired
	private IArtistRepo repo;

	
	// Using Save() Method
	
	  @Override public String registerArtist(Artist art) {
	  
	  repo.save(art);
	  
	  
	  return "Registered ";
	  
	  }
//===============================================================================
//Using ExistById() Method

	@Override
	public boolean checkAvailability(int id) {
		
		boolean check=repo.existsById(id);
		return check;
	}
//===============================================================================
// using Count () method

	@Override
	public long showArtist() {
		
		long lo=repo.count();
		return lo;
	}
	
	
	//===========================================================================

	
	// SaveAll () Method
	@Override
	public String addMore(List<Artist> art) {
		
		Iterable<Artist> addM=repo.saveAll(art);
		
		
		//addM.forEach(System.out::println);
		
		
		
		
		  List<Integer> listAdd= new ArrayList();
		  
		  addM.forEach(artist->{
		  
		  listAdd.add(artist.getId()); });
		 
		
		
		
		return listAdd.size()+ "Artist are saved"+ listAdd.toString();
		
		//return "Artist are Svaed";
	}
//==============================================================
	//FindAll method
	@Override
	public Iterable<Artist> findAll() {
		
		
		Iterable<Artist> findA=repo.findAll();
		
		
		
		return findA;
	}

	
	
	//==================================================================
	//FindAllById
	@Override
	public Iterable<Artist> findAllById(Iterable<Integer> id) {
		
		Iterable<Artist> itr=repo.findAllById(id);
		
		
		return itr;
	}
	//=================================================================


	
	
	  //FindById
	  
	  @Override public Optional<Artist> opArtFindById(Integer ids) {
	  
	  
	  Optional<Artist> ita=repo.findById(ids); return ita; }
	 
	  
	  //=======================================================================
	//DeleteById method
	
	//@Override
	public String deleteByid(Integer id) {
		
		
		
		repo.deleteById(id);
		
		
		
		return "Deleted Successfulyyyy";
	}
	
	
	//===================================================
	//DeleteAllById
	
	@Override
	public String deleteAllByid(Iterable<Integer> ids) {
		
		
		
		repo.deleteAllById(ids);
		
		
		return "Deleted";
	}
	
	
	
	

}
