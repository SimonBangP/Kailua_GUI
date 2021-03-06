package com.example.kailua_gui.Controller;

import com.example.kailua_gui.Model.Customer;
import com.example.kailua_gui.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @GetMapping("/customer")
    public String customer (Model model) {
        List<Customer> customerList = customerService.getCustomers();
        model.addAttribute("customers", customerList);
        return "customer/customer";}

    @GetMapping ("/createCustomer")
    public String create() {
        return "customer/createCustomer";
    }

    @PostMapping("/createCustomer")
        public String create(@ModelAttribute Customer customer){
        customerService.createNewCustomer(customer);
        return "redirect:/";
    }

    @GetMapping("/deleteCustomer/{customerID}")
    public String deleteCustomer(@PathVariable ("customerID") int customerID){
       Boolean delete = customerService.deleteCustomer(customerID);
        if (delete){
            return "redirect:/";
        }else {
            return "redirect:/";
        }
    }

    @GetMapping ("customerDetails/{customerID}")
    public String viewSpecificCustomer (@PathVariable ("customerID") int customerID, Model model){
    model.addAttribute("customer", customerService.findSpecificCustomer(customerID));
    return "customer/customerDetails";
    }
}

