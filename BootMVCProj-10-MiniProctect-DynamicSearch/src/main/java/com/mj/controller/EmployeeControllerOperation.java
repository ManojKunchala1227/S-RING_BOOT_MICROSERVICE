package com.mj.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mj.entity.Employee;
import com.mj.service.IEmployeeService;

@Controller
public class EmployeeControllerOperation 
{
	@Autowired
	private IEmployeeService iempser;
	
	@GetMapping("/")
	public String homePage()
	{
		System.out.println("Home Is Invoked");
		//LVN
		return "welcome";
	}
//================================================================================================	
	@GetMapping("/report")
	public String showAllEmp(Map<String,Object> map,@ModelAttribute("emp") Employee emp)
	{
		
		try
		{
			System.out.println("Show All Page Invoked");
			List<Employee> list=iempser.findAll();
			
			list.forEach(System.out::println);
			
			map.put("emplist", list); 
			
			
			//LVN
			return "show_report";
		}
		catch(Exception e)
		{
			map.put("errorMsg", e.getMessage());
			
			//LVN
			return "error";
			
		}		
		
	}
	
//===================================================================================
	
	@GetMapping("/addemp")
	public String addEmp(@ModelAttribute("emp") Employee emp)
	{
		//LVN
		return "registerEmp";
	}
	
//==================================================================================
@PostMapping("/register")
	public String registerEmployee(Map<String,Object> map, @ModelAttribute("emp") Employee emp)
	{
		try
		{
			System.out.println("post map Invoked");
			String msg=iempser.registerEmp(emp);
			map.put("resultMsg",msg);
			
		return "redirect:report";
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			map.put("errorMsg", e.getMessage());
			
			//LVN
			return "error";	
		}
		
	}






//@PostMapping("/register")
//public String registerEmployee(Map<String,Object> map, @ModelAttribute("emp") Employee emp)
//{
//	try
//	{
//		System.out.println("post map Invoked");
//		String msg=iempser.registerEmp(emp);
//		map.put("resultMsg",msg);
//		
//		List<Employee> list=iempser.findAll();
//		map.put("emplist", list);
//		
//		
//		return "show_report";
//		
//	}
//	catch(Exception e)
//	{
//		e.printStackTrace();
//		map.put("errorMsg", e.getMessage());
//		
//		//LVN
//		return "error";	
//	}
//	
//}
	

//==================================================================================

@GetMapping("/empedit")
public String showEditFormPage(@RequestParam("no") Integer no, @ModelAttribute("emp") Employee emp)
{
	
	System.out.println("Employee Edit is Invoked");
	
	//use Service
	Employee emp1=iempser.fetchById(no);
	
	//copy emp1 object data to emp object
	BeanUtils.copyProperties(emp1, emp);
	return"editForm";
}

	
//==================================================================================
	
	  @PostMapping("/updaterequest")
	  
	  public String updatedEmployeeDetails( RedirectAttributes attrs,@ModelAttribute("emp")
	  Employee emp) {
	  
		  
		  try
		  {
			  //use Service
			  String msg=iempser.editEmp(emp);
			  
			  //keep the results in model attribute
			  
			  attrs.addFlashAttribute("resultMsg", msg);
			  return "redirect:report";
			  
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
			  
			  attrs.addAttribute("errorMsg", e.getMessage());
			  
			  return "error";
			  
		  }
		 
 
	  
	  
	  }
	 

//==================================================================================
		/*
		 * @GetMapping("/empdelete") public String deleteEmp(@ModelAttribute("emp")
		 * Employee emp) {
		 * 
		 * return "deleteForm";
		 * 
		 * }
		 */
	  
	  
	@GetMapping("/empdelete")  
	  public String removeEmployee(@RequestParam("no") int no, Map<String,Object> map)
	  {
		  try
		  {
			  String msg=iempser.deleteEmp(no);
			  
			  map.put("resultMsg", msg);
			  
			  return "forward:report";
		  }
		  
		  catch(Exception e)
		  {
			  e.printStackTrace();
			  map.put("errorMsg", e.getMessage());
			  return "error";
			  
		  }
		  
		  
		 
	  }

//==================================================================================
		/*
		 * @PostMapping("/deleterequest")
		 * 
		 * public String EmpDeleted( Map<String,Object> map,@ModelAttribute("emp")
		 * Employee emp) {
		 * 
		 * String msg= iempser.deleteEmp(emp.getId());
		 * 
		 * map.put("resultMsg", msg);
		 * 
		 * return "redirect:report"; }
		 */
	
	//==================================================================================
	@PostMapping("/search")
	public String searchDataDynamicaly(Map<String, Object> map,@ModelAttribute("emp") Employee emp)
	{
		
		List<Employee> list=iempser.showEmployeeReportWithDynamicSearch(emp);
		
		
		map.put("emplist",list);
		
		return"redirect:report";
	}
} 
