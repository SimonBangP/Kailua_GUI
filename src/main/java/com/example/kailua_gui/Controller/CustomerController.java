package com.example.kailua_gui.Controller;

import com.example.kailua_gui.Model.Customer;
import com.example.kailua_gui.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @GetMapping("/customer")
    public String customer () {
        return "customer/customer";}

    @GetMapping ("/createCustomer")
    public String create() {
        return "customer/createCustomer";
    }
    @PostMapping("createCustomer")
        public String create(@ModelAttribute Customer customer){
        customerService.createNewCustomer(customer);
        return "redirect:/";
    }

    @GetMapping("deleteCustomer")
    public String delete(){
        return "customer/deleteCustomer";
    }

}

