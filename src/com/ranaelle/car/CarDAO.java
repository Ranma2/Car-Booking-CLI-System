package com.ranaelle.car;

import java.math.BigDecimal;

public class CarDAO {
    private static final Car [] cars;

    static{
        cars = new Car[]{
                new Car("LBD2456", "Toyota", new BigDecimal("76.52"), EngineType.DIESEL),
                new Car("GRE2278", "Mazda", new BigDecimal("100.05"),EngineType.GASOLINE),
                new Car("UYT6987", "Honda", new BigDecimal("60.25"), EngineType.ELECTRIC)
        };

    }
    public Car[] getCars(){
        return cars;
    }
}
