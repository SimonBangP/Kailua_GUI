package com.example.kailua_gui.Service;

import com.example.kailua_gui.Model.Car;
import com.example.kailua_gui.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepository CarRepository;

    public List<Car> getCars(){
        return CarRepository.getCars();
    }
    public void createNewCar(Car car){
        CarRepository.createNewCar(car);
    }
    public Car findSpecificCar(String registrationNumber){
        return CarRepository.findSpecificCar(registrationNumber);
    }
    public boolean deleteCar(String registrationNumber){
        return CarRepository.deleteCar(registrationNumber);
    }
    public void updateCurrentCar(Car car, String registrationNumber){ CarRepository.updateCurrentCar(car, registrationNumber); }
}
