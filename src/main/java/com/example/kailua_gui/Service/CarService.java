package com.example.kailua_gui.Service;

import com.example.kailua_gui.Model.Car;
import com.example.kailua_gui.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarService {

    @Autowired
   CarRepository carRepository;

    public List<Car> getCars() {
        return carRepository.getCars();
    }
    public void createNewCar (Car car){
        carRepository.createNewCar(car);
    }

    public Car findSpecificCar (String registrationNumber ){
        return carRepository.findSpecificCar(registrationNumber);
    }

    public void deleteCar (String registrationNumber){
        carRepository.deleteCar(registrationNumber);
    }
    public void updateCurrentCar (Car car, String registrationNumber){
        carRepository.updateCurrentCar(car, registrationNumber);
    }

}
