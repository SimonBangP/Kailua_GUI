package com.example.kailua_gui.Controller;


import com.example.kailua_gui.Model.Customer;
import com.example.kailua_gui.Model.RentalContract;
import com.example.kailua_gui.Service.RentalContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RentalContractController {

    @Autowired
    RentalContractService rentalContractService;

    @GetMapping("/rentalContract")
    public String rentalContract (Model model) {
        List<RentalContract> rentalContractList = rentalContractService.getRentalContract();
        model.addAttribute("rentalContracts", rentalContractList);
        return "rentalContract/rentalContract";}

    @GetMapping ("/createRentalContract")
    public String create() {
        return "rentalContract/createRentalContract";
    }

    @PostMapping("createRentalContract")
    public String create(@ModelAttribute RentalContract rentalContract){
        rentalContractService.createNewRentalContract(rentalContract);
        return "redirect:/rentalContract";
    }

    @GetMapping("/deleteRentalContract/{rentalContractID}")
    public String delete(@PathVariable ("rentalContractID") int rentalContractID){
        boolean delete = rentalContractService.deleteRentalContract(rentalContractID);
        if (delete){
            return "redirect:/";
        }else {
            return "redirect:/";
        }
    }

}

