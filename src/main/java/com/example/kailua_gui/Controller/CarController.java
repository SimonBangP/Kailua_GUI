package com.example.kailua_gui.Controller;

import com.example.kailua_gui.Model.Car;
import com.example.kailua_gui.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public String car (Model model) {
        List<Car> carList = carService.getCars();
        model.addAttribute("cars", carList);
        return "cars/cars";}

    @GetMapping ("/createCar")
    public String create() {
        return "cars/createCar";
    }
    @PostMapping("createCar")
    public String create(@ModelAttribute Car car){
        carService.createNewCar(car);
        return "redirect:/";
    }

    @GetMapping("deleteCar")
    public String delete(){
        return "cars/deleteCar";
    }
}

