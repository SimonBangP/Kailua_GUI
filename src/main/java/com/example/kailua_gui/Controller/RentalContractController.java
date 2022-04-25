package com.example.kailua_gui.Controller;


import com.example.kailua_gui.Model.Customer;
import com.example.kailua_gui.Model.RentalContract;
import com.example.kailua_gui.Service.RentalContractService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RentalContractController {

    RentalContractService rentalContractService;

    @GetMapping("/rentalContract")
    public String rentalContract () {
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

    @GetMapping("deleteRentalContract")
    public String delete(){
        return "rentalContract/deleteRentalContract";
    }

}

