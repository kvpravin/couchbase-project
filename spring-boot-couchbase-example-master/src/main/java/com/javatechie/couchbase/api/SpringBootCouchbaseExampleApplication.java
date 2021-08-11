package com.javatechie.couchbase.api;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class})
@SpringBootApplication
@Controller
public class SpringBootCouchbaseExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCouchbaseExampleApplication.class, args);
	}
}  
