package com.javatechie.couchbase.api.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.javatechie.couchbase.api.model.Customer;
import com.javatechie.couchbase.api.repository.CustomerRepository;
@Controller
public class CouchbaseMainController {
	@Autowired
	private CustomerRepository repo;
 

	@GetMapping("/fetchall")
	public String  getAll(Model model) {
		 List<Customer> a = (List<Customer>) repo.findAll();
		 model.addAttribute("custdetails",a );
		return "customerdetails";
	}

	
	@GetMapping("/fetch")
	@ResponseBody
    public  List<Customer> findOne(String john) {
        return  repo.findid("45");
    } 
	
	@GetMapping("/")
    public  String  homepage() {
        return  "welcome";
    } 
   
	@GetMapping("/insert")
	public String getdetails()
    {  
    	return "insert";
}
	
	
	@PostMapping("/insert")
	public String savedetails(@RequestParam int id,@RequestParam String name,@RequestParam String address) throws ParseException
    {  
		String s=Integer.toString(id);
		List<Customer>custlist = repo.findid(s);
		if(!custlist.isEmpty())
		{
		
    	return "No new creation";
		}
		else {
			Customer cust = new Customer();
			cust.setId(id);
			cust.setName(name);
			cust.setAddress(address);
			repo.save(cust);
	    	return "welcome";
		}
}
	@GetMapping("/delete")
    public String getid() {
        return  "deleteinput";
    } 
	
	@PostMapping("/delete")
    public String DeleteUser(@RequestParam int id) {
		String s=Integer.toString(id);
		List<Customer>custlist = repo.findid(s);
		System.out.println(custlist);
		if(custlist.isEmpty())
		{
		
    	return "nodelete";
		}
		else {
		
		System.out.println(s);
        repo.removeUser(s);
        return "user deleted";
    } }
	
	@GetMapping("/update") 
    public String updateUser(Model model) throws ParseException {
			List<Customer> a = (List<Customer>) repo.findAll();
			 model.addAttribute("custdetails",a );
		return "update";
    } 
	
	 @GetMapping("/update1") 
	    public String viewHomePage1(Model model,@RequestParam int id,@RequestParam String name,@RequestParam String address)throws ParseException
	 {
		 System.out.println("id is"+id);
		model.addAttribute("id",id);
		model.addAttribute("name",name);
	        model.addAttribute("address",address );
	        String s=Integer.toString(id);
	        repo.removeUser(s);
	    	return "update1";   
	    } 
	 
	 
	}
	 
  