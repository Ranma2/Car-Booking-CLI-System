package com.ranaelle.car;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    // Car's attributes
    private String registrationNumber;
    private String BrandName;
    private BigDecimal pricePerDay;
    private EngineType engineType;

    private Boolean available = true;

    // no args constructor
    public Car() {
    }

    //parameterized constructor

    public Car(String registrationNumber, String brandName, BigDecimal pricePerDay, EngineType engineType) {
        this.registrationNumber = registrationNumber;
        BrandName = brandName;
        this.pricePerDay = pricePerDay;
        this.engineType = engineType;
    }
     // getRegistrationNumber method returns car's registration Number
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    //setRegistrationNumber method sets car's registration Number
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    //getBrandName method returns car's brand
    public String getBrandName() {
        return BrandName;
    }

    //setBrandName method set car's name
    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    //getPricePerDay method returns car's price for a day
    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    //setPricePerDay method sets car's price per day
    public void setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    // getEngineType method return car's engine type
    public EngineType getEngineType() {
        return engineType;
    }

    //setEngineType method sets car's engine type
    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    //toString method is used to output the car's attributes
    @Override
    public String toString() {
        return "Car{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", BrandName='" + BrandName + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", engineType=" + engineType +
                '}'+
                "\n";
    }

    //equals and hashcode methods use to compare cars objects

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(BrandName, car.BrandName) && Objects.equals(pricePerDay, car.pricePerDay) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber, BrandName, pricePerDay, engineType);
    }
}
