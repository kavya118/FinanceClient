package com.kavya.service;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.web.client.RestTemplate;

import com.kavya.model.User;

import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	//set up the class as a service
	@Service
	public class RestClientService {

	    //define a RestTemplate object
	    private final RestTemplate restTemplate;

	    //web service resources endpoints
	    private final String GET_ALL_URL = "http://localhost:8080/financemanager/users";
	    private final String GET_URL_BY_ID = "http://localhost:8080/financemanager/users/";

	    //define an argument constructor, pass in the RestTemplate object
	    //and Autowire it
	    @Autowired
	    public RestClientService(RestTemplate restTemplate){
	        this.restTemplate = restTemplate;
	    }
	     /**
	     * Get all products
	     * @return a list
	     */
	    public List<User> findAllUsers(){
	        return Arrays.stream(restTemplate.getForObject(GET_ALL_URL,User[].class)).collect(Collectors.toList());
	    }

	    /**
	     * Get a product by id
	     * @param id of product
	     * @return a product
	     */
	    public User findUserById(String id){
	        return restTemplate.getForObject(GET_URL_BY_ID +id, User.class);
	    }
	
}
