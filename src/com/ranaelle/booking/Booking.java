package com.ranaelle.booking;

import com.ranaelle.car.Car;
import com.ranaelle.user.User;

import java.time.LocalDateTime;
import java.util.Objects;


public class Booking {
    //Booking's attributes
    private int numOfDays;
    private LocalDateTime date;
    private Car car;
    private User user;
    private String referenceNumber;

    //no args constructor
    public Booking() {
    }

    //parameterized constructor
    public Booking(int numOfDays, LocalDateTime date, Car car, User user, String referenceNumber) {
        this.numOfDays = numOfDays;
        this.date = date;
        this.car = car;
        this.user = user;
        this.referenceNumber = referenceNumber;
    }

    //getNumOfDays method returns booking's number of days
    public int getNumOfDays() {
        return numOfDays;
    }

    //setNumOfDays method sets booking's num Of Days
    public void setNumOfDays(int numOfDays) {
        this.numOfDays = Booking.this.numOfDays;
    }

    //LocalDateTime method return booking's date
    public LocalDateTime getDate() {
        return date;
    }

    //setDate method sets booking's date
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    //getCar method returns car booked
    public Car getCar() {
        return car;
    }

    //setCar method set booked car
    public void setCar(Car car) {
        this.car = car;
    }

    //getUser method returns user that booked a car
    public User getUser() {
        return user;
    }

    //setUser method sets a user who booked a car
    public void setUser(User user) {
        this.user = user;
    }

    //getReferenceNumber method retruns the booking's reference number
    public String getReferenceNumber() {
        return referenceNumber;
    }

    //setReferenceNumber method sets the booking reference number
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    ////toString method is used to output the booking's attributes
    @Override
    public String toString() {
        return "Booking{" +
                "numOfDays=" + numOfDays +
                ", date=" + date +
                ", car=" + car +
                ", user=" + user +
                ", referenceNumber='" + referenceNumber + '\'' +
                '}';
    }

    //equals and hashcode methods use to compare bookings objects
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return numOfDays == booking.numOfDays && Objects.equals(date, booking.date) && Objects.equals(car, booking.car) && Objects.equals(user, booking.user) && Objects.equals(referenceNumber, booking.referenceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOfDays, date, car, user, referenceNumber);
    }
}
