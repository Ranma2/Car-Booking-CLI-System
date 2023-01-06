package com.ranaelle.car;

import com.ranaelle.booking.BookingService;
import com.ranaelle.user.User;

import java.util.Arrays;
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



    public void  getAvailableCars(){
        boolean noAvailability = true;
       for (int i =0; i < seeAllCars().length; i++){
          if(!(seeAllCars()[i].getAvailable().equals(false))) {
              noAvailability = false;
              System.out.println(seeAllCars()[i]);

          }
       }
       if(noAvailability){
           System.out.println("There is no car available to rent ☹");

       }
    }

    public Car[] seeAllCars(){
        return carDAO.getCars();
    }


}
