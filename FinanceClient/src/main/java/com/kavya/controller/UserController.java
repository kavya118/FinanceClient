package com.kavya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kavya.service.RestClientService;

@Controller
public class UserController {

    //define a service constant
    private final RestClientService service;

    //Argument contructor of controller, pass in the service
    //and Autowire it
    @Autowired
    public UserController(RestClientService service){
       this.service = service;
    }

    /**
     * Get all products
     * @param model to bind products to view
     * @return the products.html page
     */
    @GetMapping("users")
    public String getAll(Model model){
        model.addAttribute("users", service.findAllUsers());
        return "users";
    }

    /**
     * Get a product by id
     * @param id of product
     * @param model binding a product to view
     * @return a product page
     */
    @RequestMapping("/user/{id}")
    public String getById(@PathVariable String id, Model model){
        model.addAttribute("user", service.findUserById(id));
        return "showuser";
    }
}