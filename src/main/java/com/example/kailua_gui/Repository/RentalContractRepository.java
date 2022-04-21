package com.example.kailua_gui.Repository;

import com.example.kailua_gui.Model.Car;
import com.example.kailua_gui.Model.Customer;
import com.example.kailua_gui.Model.RentalContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class RentalContractRepository {
    @Autowired
    JdbcTemplate template;

    public List<RentalContract> RentalContracts (){
        return null;
    }

    public void createNewRentalContract (RentalContract rentalContract){}

    public void updateCurrentRentalContract (RentalContract rentalContract, int rentalContractID ){}

    public void deleteRentalContract (int rentalContractID){}

    public RentalContract findSpecificRentalContract (int rentalContractID){
        return null;
    }
}
