package com.spring.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.client.RestTemplate;

public class RestTemplateExample {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		Person[] personList = restTemplate.getForObject("http://localhost:8080/rest/api/person",Person[].class);
		for(Person p: personList){
			System.out.println(p.getName());
		}
	}

}
