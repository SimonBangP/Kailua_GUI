package com.example.kailua_gui.Controller;

import com.example.kailua_gui.Model.Car;
import com.example.kailua_gui.Service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CarController {

    CarService carService;


    @GetMapping ("/cars")
    public String car (Model model){
        List<Car> carList = carService.getCars();
        model.addAttribute("cars", carList);
        return "cars/cars";}
}