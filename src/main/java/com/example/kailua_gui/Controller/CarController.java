package com.example.kailua_gui.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {


    @GetMapping ("/cars")
    public String car (){
        return "cars/cars";}
}