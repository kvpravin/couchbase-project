package com.javatechie.couchbase.api.repository;

import java.util.List;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import com.javatechie.couchbase.api.model.Customer;
@N1qlPrimaryIndexed
@ViewIndexed(designDoc="customer",viewName="all")
public interface CustomerRepository extends CouchbaseRepository<Customer, Integer>{
	 
	@Query("#{#n1ql.selectEntity} WHERE  META().id= $1 ")
	 List<Customer> findid(String id);

	@Query("#{#n1ql.delete} WHERE  META().id= $1 ")
		Customer removeUser(String id);

}
