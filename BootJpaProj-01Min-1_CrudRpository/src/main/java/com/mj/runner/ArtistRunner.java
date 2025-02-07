package com.mj.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mj.entity.Artist;
import com.mj.service.artistServiceImpl;

@Component("ArtistRunner")
public class ArtistRunner implements CommandLineRunner {

	@Autowired
	private artistServiceImpl asimpl;

	@Override
	public void run(String... args) throws Exception {

		Scanner s = new Scanner(System.in);
		
		
		
		Artist ar= new Artist();
		ar.setName("NISHA");
		ar.setCategory("SALESMAN");
		ar.setSal(99999.0);
		
	String msg=asimpl.registerArtist(ar);
	System.out.println(msg);

		/*
		 * Artist ar= new Artist("ma","stu",2.0); Artist ar1= new Artist("a","stu",2.0);
		 * Artist ar2= new Artist("n","stu",2.0); Artist ar3= new Artist("o","stu",2.0);
		 * Artist ar4= new Artist("j","stu",2.0);
		 * 
		 * 
		 * 
		 * List<Artist> listAdded=List.of(ar,ar1,ar2,ar3,ar4); try {
		 * 
		 * String msg=asimpl.addMore(listAdded); System.out.println(msg);
		 * 
		 * } catch(Exception e) { e.printStackTrace();
		 * 
		 * System.out.println("Exception raised at runner class");
		 * 
		 * }
		 */
		// ==========================================================================

		/*
		 * Artist arti= new Artist();
		 * 
		 * arti.setName("maia"); arti.setCategory("Stu"); arti.setSal(2000.00);
		 * 
		 * 
		 * 
		 * try { String msg=asimpl.registerArtist(arti);
		 * 
		 * System.out.println(msg);
		 * 
		 * }// try catch(Exception e) { e.printStackTrace();
		 * System.out.println("Exception raised");
		 * 
		 * } // catch
		 */

		// ===============================================================================

		/*
		 * System.out.println("Enther the Artist no::"); Integer no=s.nextInt();
		 * 
		 * try { System.out.println(asimpl.checkAvailability(no)); } catch(Exception e)
		 * { e.printStackTrace();
		 * System.out.println("Exception raised at Runner class");
		 * 
		 * }
		 */

		// ====================================================================================

		/*
		 * try { System.out.println(asimpl.showArtist()); } catch(Exception e) {
		 * e.printStackTrace(); System.out.println(" Exception raised at Runner class");
		 * 
		 * }//catch
		 */

		// ========================================================================

		// FindAll Method
		/*
		 * try { Iterable<Artist> list=asimpl.findAll();
		 * 
		 * 
		 * list.forEach(System.out::println);
		 * 
		 * System.out.println("===========================================");
		 * 
		 * for(Artist ar:list) { System.out.println(ar); }
		 * 
		 * System.out.println("===========================================");
		 * 
		 * list.forEach(art-> System.out.println(art));
		 * 
		 * System.out.println("===========================================");
		 * 
		 * Stream.of(list).forEach(System.out::println);
		 * 
		 * System.out.println("===========================================");
		 * 
		 * Stream.of(list).forEachOrdered(System.out::println);
		 * 
		 * 
		 * } catch(Exception e) { e.printStackTrace();
		 * 
		 * System.out.
		 * println("===============EXCEPTION IN RUNNER CLASS ========================");
		 * }
		 */

		// =================================================================================

		/*
		 * try {
		 * 
		 * 
		 * Iterable<Artist> ar=asimpl.findAllById(List.of(1));
		 * ar.forEach(System.out::println);
		 * 
		 * 
		 * 
		 * 
		 * asimpl.findAllById(List.of(1)).forEach(System.out::println);
		 * 
		 * } catch(Exception e) { e.printStackTrace(); }
		 */

		// =====================================================================
		// Optional FindById Method

		
		/*
		 * try {
		 * 
		 * Optional<Artist> ar=asimpl.opArtFindById(1010);
		 * 
		 * System.out.println(ar);
		 * 
		 * } catch(Exception e) { e.printStackTrace(); }
		 */
		//====================================================
		/*
		 * //DeleteById
		 * 
		 * try { String msg=asimpl.deleteByid(1);
		 * 
		 * System.out.println(msg);
		 * 
		 * } catch(Exception e) { e.printStackTrace(); }
		 */
		
		//=============================================================
		
		
		//DeleteById
		
		/*
		 * try { String msg=asimpl.deleteAllByid(List.of(1000,1001));
		 * 
		 * System.out.println(msg);
		 * 
		 * } catch(Exception e) { e.printStackTrace(); }
		 */
		s.close();
	}// run method

}// class
