package com.example.kailua_gui.Repository;


import com.example.kailua_gui.Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepository {
    
    @Autowired
    JdbcTemplate template; 
    
    public List<Car> getCars (){
        return null;
    }
    
    public void createNewCar (Car car){}
    
    public void updateCurrentCar (Car car, String regNum ){}
    
    public void deleteCar (String regNum){}
    
    public Car findSpecificCar (String regNum){
        return null;
    }
    
    
}
