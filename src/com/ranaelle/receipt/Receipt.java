package com.ranaelle.receipt;

import com.ranaelle.booking.Booking;
import com.ranaelle.car.Car;
import com.ranaelle.user.User;

import java.math.BigDecimal;
import java.util.Objects;

public class Receipt {
    //Receipt's attributes
    private BigDecimal totalPrice;
    private User user;
    private Booking booking;
    private Car car;

    //no args constructor
    public Receipt() {
    }

    //parameterized constructor
    public Receipt(BigDecimal totalPrice, User user, Booking booking, Car car) {
        this.totalPrice = totalPrice;
        this.user = user;
        this.booking = booking;
        this.car = car;
    }

    //getTotalPrice method returns the booking's price
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    //setTotalPrice sets the booking's price
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    //getUser method returns the user
    public User getUser() {
        return user;
    }

    //setUser method sets the user
    public void setUser(User user) {
        this.user = user;
    }

    //
    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "totalPrice=" + totalPrice +
                ", user=" + user +
                ", booking=" + booking +
                ", car=" + car +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receipt receipt = (Receipt) o;
        return Objects.equals(totalPrice, receipt.totalPrice) && Objects.equals(user, receipt.user) && Objects.equals(booking, receipt.booking) && Objects.equals(car, receipt.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalPrice, user, booking, car);
    }
}
