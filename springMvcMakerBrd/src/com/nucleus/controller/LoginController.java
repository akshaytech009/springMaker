package com.nucleus.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nucleus.model.persistence.dao.LoginDao;
import com.nucleus.model.persistence.entity.Customer;
import com.nucleus.model.persistence.entity.User;
import com.nucleus.service.ServiceDao;

@Controller
@RequestMapping
public class LoginController {

	
	@Autowired
 private LoginDao loginDao;
	
 @RequestMapping(value="/")
 public String ShowLoginForm(){
	
	 return "index";
 }
 
 

	@Autowired
	private ServiceDao serviceDao;
	
	// ***************add*******************
	@RequestMapping(value ="/adduser", method= RequestMethod.GET)
	public String adduser(Model m)
	{
		
		m.addAttribute("command",new Customer());
		return "NewUser";
		
	}
	
	@RequestMapping(value ="/addnewuser", method= RequestMethod.POST)
	public String addnewUser(Model model,@ModelAttribute Customer customer){
		
		model.addAttribute(customer);
		serviceDao.addcustomer(customer);
		
		
		return "showCustomer";
		
	}
	
	//****************delete******************
	@RequestMapping(value ="/deleteuser", method= RequestMethod.GET)
	public String deleteuser()
	{
		
		//m.addAttribute("command",new Customer());
		return "DeleteUser";
		
	}
 
	@RequestMapping(value ="/delete", method= RequestMethod.POST)
	public String delete(Model model,@RequestParam("customerCode") String customerCode){
		serviceDao.deleteCustomer(customerCode);	
		return "showCustomer";
		
	}
	//******************view one *************
	@RequestMapping(value ="/viewuser", method= RequestMethod.GET)
	public String viewuser()
	{
		
		
		return "ViewOne";
		
	}
 
	@RequestMapping(value ="/oneview", method= RequestMethod.POST)
	public String oneview(Model model,@RequestParam("customerCode") String customerCode){
		
		System.out.println("hiiiii");
		
		Customer customer = serviceDao.viewCustomer(customerCode);
		model.addAttribute("customer", customer);
		
		
		return "ViewOneTable";
		
	}
	//****************viewall*********************
	
	
	@RequestMapping(value="/viewall", method = RequestMethod.GET)
	public String viewAll(Model model){
		
		List<Customer> customer = serviceDao.viewAll();
		
		model.addAttribute("customer", customer);
		
		return "ViewAll";
				
		
	}
	//**************update***************
	
	@RequestMapping(value="/update", method = RequestMethod.GET)
	public String updateUser(){
		return "UpdateUser";
			
	}
	@RequestMapping(value="/updatevalue",method = RequestMethod.POST)
	public String updateValue(Model model,@RequestParam("customerCode") String customerCode,@ModelAttribute Customer customer){
		
	   customer = serviceDao.viewCustomer(customerCode);
		model.addAttribute("customer", customer);
		
		return "UpdateDetails";
				
	}
	@RequestMapping(value="/updated", method = RequestMethod.POST)
	public String updated(@ModelAttribute Customer customer){
		serviceDao.updateCustomer(customer);
		return "showCustomer";
			
	}
	
	
 
 //*************login*******************
	@RequestMapping(value="/processLoginForm",method=RequestMethod.POST)
	 public String ProcessLoginForm(Model model,@RequestParam("userName") String userName,@RequestParam("userPassword") String userPassword,HttpServletRequest request){
		 if(loginDao.validate(userName, userPassword))
		 { User user=null;
				user = loginDao.getUser(userName, userPassword);
				model.addAttribute("user", user);
				HttpSession httpSession=request.getSession(true);
				httpSession.setAttribute("userName",userName);
				return "home";
		 }
		 else{
			 String result = " sorry Wrong username or password";
			 model.addAttribute("message", result);
			 return "index";
		 }
		
	 }
}
