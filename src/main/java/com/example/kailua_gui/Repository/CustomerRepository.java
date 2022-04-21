package com.example.kailua_gui.Repository;

import com.example.kailua_gui.Model.Car;
import com.example.kailua_gui.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CustomerRepository {

   @Autowired
    JdbcTemplate template;

   public List<Customer> getCustomers (){
       return null;
   }

    public void createNewCustomer (Customer customer){}

    public void updateCurrentCustomer (Customer customer, int customerID ){}

    public void deleteCustomer (int customerID){}

    public Car findSpecificCustomer (int customerID){
        return null;
    }

}
