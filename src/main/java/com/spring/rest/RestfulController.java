package com.spring.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class RestfulController {
	
	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public @ResponseBody List<Person> getPerson(){
		List<Person> personList = new ArrayList<Person>();
		Person person = new Person();
		person.setName("Bill Murray");
		person.setAge(65);
		personList.add(person);
		
		Person person2 = new Person();
		person2.setName("Julia Roberts");
		person2.setAge(45);
		
		personList.add(person2);
		return personList;
	}
	
	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public @ResponseBody Person createPerson(@RequestBody Person person){
		System.out.println("First Name:" + person.getName());
		System.out.println("Age:" + person.getAge());
		return person;
	}
	
	

}
