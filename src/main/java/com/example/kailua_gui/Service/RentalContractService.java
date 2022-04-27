package com.example.kailua_gui.Service;


import com.example.kailua_gui.Model.Customer;
import com.example.kailua_gui.Model.RentalContract;
import com.example.kailua_gui.Repository.RentalContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RentalContractService {

    @Autowired
    RentalContractRepository rentalContractRepository;

    public List<RentalContract> getRentalContract(){
        return rentalContractRepository.getRentalContracts();
    }

    public void createNewRentalContract(RentalContract rentalContract){
        rentalContractRepository.createNewRentalContract(rentalContract);
    }

    public RentalContract findSpecificRentalContract(int rentalContractID){
        return rentalContractRepository.findSpecificRentalContract(rentalContractID);
    }

    public boolean deleteRentalContract(int rentalContractID){
        return rentalContractRepository.deleteRentalContract(rentalContractID);}

    public void updateCurrentRentalContract(RentalContract rentalContract, int rentalContractID){
        rentalContractRepository.updateCurrentRentalContract(rentalContract, rentalContractID); }
}
