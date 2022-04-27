package com.example.kailua_gui.Repository;

import com.example.kailua_gui.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CustomerRepository {

   @Autowired
    JdbcTemplate template;

    public List<Customer> getCustomers (){
        String sql = "SELECT * FROM customers";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        return template.query(sql, rowMapper);
   }

    public void createNewCustomer (Customer customer){
        String sql = "INSERT INTO customers (CustomerId, FirstName, LastName, addressId, PhoneNumber, Email, Birthday) VALUES(?, ?, ?, ?, ?, ?, ?)";
        template.update(sql, customer.getCustomerID(),customer.getFirstname(), customer.getLastname(), customer.getAddressID(), customer.getPhoneNumber(), customer.geteMail(), customer.getBirthday());
    }

    public void updateCurrentCustomer (Customer c, int customerID ){
        String sql = "UPDATE customers Set FirstName = ?, LastName = ?, AddressId = ?, PhoneNumber = ?, Email = ? WHERE CustomerId = ?";
        template.update(sql, c.getFirstname(), c.getLastname(), c.getAddressID(), c.getPhoneNumber(), c.geteMail(), c.getCustomerID());
    }

    public boolean deleteCustomer (int customerId){
        String sql = "DELETE FROM customers WHERE CustomerId = ?";
       return template.update(sql, customerId) > 0;
    }

    public Customer findSpecificCustomer (int customerId){
        String sql = "SELECT * FROM customers WHERE CustomerId = ?";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        Customer customer = template.queryForObject(sql, rowMapper, customerId);

        return customer;
    }
}



