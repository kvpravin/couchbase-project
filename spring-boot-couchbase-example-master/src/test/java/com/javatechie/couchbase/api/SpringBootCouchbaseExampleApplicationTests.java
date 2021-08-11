package com.javatechie.couchbase.api;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.javatechie.couchbase.api.model.Customer;
import com.javatechie.couchbase.api.repository.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootCouchbaseExampleApplicationTests 

{
	@Autowired
	private CustomerRepository repo; 
	@Test
	public void alreadypresentdata() {
		
	
		ArrayList<Customer> list1 = new ArrayList<>(); // retrieve or build list
		ArrayList<Customer> list2 = new ArrayList<>(); 
		Customer cust =new Customer();
		cust.setId(45);
		cust.setAddress("chennai");
		cust.setName("pravin");
		list1.add(cust);
		list2=(ArrayList<Customer>) repo.findid("45");
		assertEquals(list1, list2);
		 
	}
	@Test
	public void notpresentdata() {
		
		
		ArrayList<Customer> list1 = new ArrayList<>(); // retrieve or build list
		ArrayList<Customer> list2 = new ArrayList<>(); 
		list2=(ArrayList<Customer>) repo.findid("450");
		assertEquals(list1, list2);
		 
	}
	
	@Test
	public void delete() {
	
		ArrayList<Customer> list1 = new ArrayList<>(); // retrieve or build list
		ArrayList<Customer> list2 = new ArrayList<>(); 
		repo.removeUser("1000");
		list2=(ArrayList<Customer>) repo.findid("1000");
		assertEquals(list1, list2);
		 
	}

}
