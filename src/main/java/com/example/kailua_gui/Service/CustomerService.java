package com.example.kailua_gui.Service;

import com.example.kailua_gui.Model.Customer;
import com.example.kailua_gui.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getCustomers(){
        return customerRepository.getCustomers();
    }
    public void createNewCustomer(Customer customer){
        customerRepository.createNewCustomer(customer);
    }
    public Customer findSpecificCustomer(int customerId){
        return customerRepository.findSpecificCustomer(customerId);
    }
    public void deleteCustomer(int customerId){ customerRepository.deleteCustomer(customerId);}
    public void updateCurrentCustomer(Customer customer, int customerId){ customerRepository.updateCurrentCustomer(customer, customerId); }
}
