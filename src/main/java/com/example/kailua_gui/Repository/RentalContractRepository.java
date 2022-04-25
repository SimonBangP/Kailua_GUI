package com.example.kailua_gui.Repository;

import com.example.kailua_gui.Model.Car;
import com.example.kailua_gui.Model.Customer;
import com.example.kailua_gui.Model.RentalContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RentalContractRepository {

    @Autowired
    JdbcTemplate template;

    public List<RentalContract> getRentalContracts (){
        String sql = "SELECT * FROM rental_contracts";
        RowMapper<RentalContract> rowMapper = new BeanPropertyRowMapper<>(RentalContract.class);

        return template.query(sql, rowMapper);
    }

    public void createNewRentalContract (RentalContract rC){
        String sql = "INSERT INTO rental_contracts (RegistrationNumber, CustomerId, StartDateTime,EndDateTime, Price, Kilometers) VALUES(?, ?, ?, ?, ?, ?)";
        template.update(sql, rC.getRentalContractID(), rC.getRegistrationNumber(), rC.getCustomerID(), rC.getStartDateTime(), rC.getEndDateTime(), rC.getPrice(), rC.getKilometers());
    }

    public void updateCurrentRentalContract (RentalContract rentalContract, int rentalContractID ){}

    public void deleteRentalContract (int rentalContractID){
        String sql = "DELETE FROM rental_contracts WHERE Id = ?)";
        template.update(sql, rentalContractID);
    }

    public RentalContract findSpecificRentalContract (int rentalContractID){
        return null;
    }
}
