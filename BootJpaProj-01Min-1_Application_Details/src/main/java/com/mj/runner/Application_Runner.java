package com.mj.runner;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mj.enetity.Application_Details;
import com.mj.serveice.IApplicationService;

@Component("Application_component")
public class Application_Runner  implements CommandLineRunner
{
	@Autowired
	IApplicationService ias;

	@Override
	public void run(String... args) throws Exception 
	{
		
		Scanner s= new Scanner(System.in);
		
		/*
		 * System.out.println("Enter the Name::"); String name=s.next();
		 * 
		 * System.out.println("Enter the Age::"); Integer age=s.nextInt();
		 * 
		 * System.out.println("Enter the Qualification::"); String qa=s.next();
		 * 
		 * System.out.println("Your are indian or not::"); Boolean
		 * indian=s.nextBoolean();
		 * 
		 * 
		 * System.out.println("Enter the Photo_Path::"); String photo=s.next();
		 * 
		 * System.out.println("Enter the Resumer_Path::"); String resume=s.next();
		 * 
		 * 
		 * 
		 * 
		 * //Converting photo to Byte FileInputStream fis= new FileInputStream(photo);
		 * byte[] photobyte= new byte[fis.available()]; photobyte=fis.readAllBytes();
		 * 
		 * 
		 * //Converting resume into Char
		 * 
		 * File f= new File(resume); FileReader fr= new FileReader(resume); int
		 * length=(int)f.length(); char[] reusmeData1=new char[length];
		 * fr.read(reusmeData1);
		 * 
		 * Application_Details ad= new Application_Details();
		 * 
		 * ad.setName(name); ad.setAge(age); ad.setQualification(qa);
		 * ad.setIndian(indian);
		 * 
		 * ad.setPhoto(photobyte); ad.setResume(reusmeData1);;
		 * 
		 * 
		 * try {
		 * 
		 * } catch(Exception e) { e.printStackTrace();
		 * System.out.println("Exception raise in runner "); }
		 * 
		 * String msg=ias.registerAplication(ad); System.out.println(msg);
		 * 
		 */
		
		
			//===================================================================================================
			System.out.println("Enter the id::");
			Integer no=s.nextInt();
			
			
			
			
		
			try {
				Optional<Application_Details> find= ias.findbyid(no);
				
				if(find.isPresent())
				{
					Application_Details ad=find.get();
					Integer id=ad.getApplicationNo() ;
					String name=ad.getName();
					Integer ag=ad.getAge();
					String q=ad.getQualification();
					Boolean b=ad.getIndian();
					
					/*
					 * byte[] byt=ad.getPhoto(); char[] cha=ad.getResume();
					 */
					
					
					System.out.println(id +" "+name+" "+ag+" "+q+" "+b +" "/*+byt+" "+cha+*/);
				
					/*
					 * try(FileOutputStream fout=new FileOutputStream("photo_retieved.jpj");
					 * FileWriter fwrite=new FileWriter("resume_retrieved.txt");) { //byte[] to
					 * destination file fout.write(byt); fout.flush();
					 * 
					 * //char[] to destination file fwrite.write(cha); fwrite.flush();
					 * 
					 * }//try catch(Exception e) { e.printStackTrace();
					 * 
					 * }//catch
					 */				}//if
				
				
			}// try
			catch(Exception e)
			{
				e.printStackTrace();
			}// catch
		
		
		
		
	}
	
	
	
	

}
