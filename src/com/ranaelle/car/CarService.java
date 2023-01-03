package com.ranaelle.car;

public class CarService {
    private CarDAO carDAO = new CarDAO();

    public Car[] seeAllCars(){
        return carDAO.getCars();
    }


}
