package com.ranaelle.car;

import com.ranaelle.user.User;

import java.util.UUID;

public class CarService {
    private CarDAO carDAO = new CarDAO();

    public Car findCar (String regNumber){
        Car car = null;
        for(int i = 0; i < seeAllCars().length; i++){
            if(seeAllCars()[i].getRegistrationNumber().equals(regNumber)){
                car = seeAllCars()[i];
            }
        }
        return car;
    }
    public Car[] seeAllCars(){
        return carDAO.getCars();
    }


}
