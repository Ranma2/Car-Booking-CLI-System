package com.ranaelle;

import com.ranaelle.booking.Booking;
import com.ranaelle.booking.BookingService;
import com.ranaelle.car.Car;
import com.ranaelle.car.CarService;
import com.ranaelle.user.User;
import com.ranaelle.user.UserService;


import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ****  WELCOME TO READY VEHICLE  🚗 ****");

        //get user input
        Scanner scn = new Scanner(System.in);
        int input;

        do {
            menu();
            input = scn.nextInt();

            switch (input) {
                case 1:
                    bookACar();
                    break;

                case 2:
                    checkBookedCAr();
                    break;

                case 3:
                    checkBookings();
                    break;

                case 4:
                    viewAvailableCars();
                    break;

                case 5:
                    viewAllUsers();
                    break;

                case 6:
                    System.out.println("xptdr");
                    break;

                case 7:
                    System.out.println(" Thank you for trusting READY VEHICLE!!!");
                    break;

                default:
                    System.out.println("This is not an option ❌");
            }


        } while (input != 7);


    }

    public static void menu() {
        System.out.println();
        System.out.println();
        System.out.println("1 - Book Car\n" +
                "2 - View All User Booked Cars\n" +
                "3 - View All Bookings\n" +
                "4 - View Available Cars\n" +
                "5 - View All Users\n" +
                "6 - View Receipt\n" +
                "7 - Exit");

    }


    //this method allows you to see the
    //available cars to rent
    public static void viewAvailableCars() {
        CarService carService = new CarService();
        carService.getAvailableCars();
    }

    //this method allows you to see all the user
    //in the database
    public static void viewAllUsers() {
        UserService userService = new UserService();
        for(int i = 0; i < userService.seeUsers().length; i++){
            System.out.println((userService.seeUsers()[i]));
        }


    }

    // with this method you can  if a user has a car booked
    public static void checkBookedCAr() {
        viewAllUsers();

        System.out.println("▶ Select user id");

        Scanner scn1 = new Scanner(System.in);
        UUID id = UUID.fromString(scn1.nextLine());

        UserService userService = new UserService();
        BookingService bookingService = new BookingService();
        Boolean empty = true;

        for (int i = 0; i < bookingService.getAllBookings().length; i++) {
             if (bookingService.getAllBookings()[i] != null &&
                     bookingService.getAllBookings()[i].getUser().getId().equals(id) ) {
                User userBooking = bookingService.getAllBookings()[i].getUser();
                System.out.println("This user: " + userBooking + "has a car booked ");
                empty = false;
                break;

            }
        }
        if(empty ) {

            System.out.println("This user:" + userService.findUser(id) + " has no cars booked");
        }

    }

    // this method allows you to see all the bookings in the database
    public static void checkBookings() {
        BookingService bookingService = new BookingService();
        Boolean empty = true;
        for (int i = 0; i < bookingService.getAllBookings().length; i++) {
            if (bookingService.getAllBookings()[i] != null) {
                System.out.println(bookingService.getAllBookings()[i]);
                System.out.println();
                empty = false;
            }
        }
        if (empty) {
            System.out.println("There is no bookings ☹");
        }
    }

    public static void bookACar(){
        Scanner scn2 = new Scanner( System.in);
        CarService carService = new CarService();
        UserService userService = new UserService();
        BookingService bookingService = new BookingService();

        System.out.println();
        carService.getAvailableCars();


        System.out.println("▶ Select a registration number: ");
        String regNumber = scn2.nextLine();
        Car car = carService.findCar(regNumber);
        System.out.println();


        viewAllUsers();
        System.out.println("▶ Select user id: ");
        UUID id = UUID.fromString(scn2.nextLine());
        User user = userService.findUser(id);
        System.out.println();


        System.out.println("How many days are you renting the car for? ");
        int numOfDays = scn2.nextInt();
        System.out.println();

        Booking booking = new Booking(numOfDays,
                                      bookingService.generateBookingDate(),
                                      car,
                                      user,
                                      bookingService.generateBookingRef());


           car.setAvailable(false);
        bookingService.addBookings(booking);

        System.out.println("🎉 Successfully booked a car 🚗 with reg number " +
                            regNumber +
                            " for user " + booking.getUser() +
                            "Booking ref: " + booking.getReferenceNumber());

    }
}