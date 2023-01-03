package com.ranaelle;

import com.ranaelle.booking.Booking;
import com.ranaelle.booking.BookingService;
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
                    System.out.println("hey");
                    break;

                case 2:
                    checkBookedCAr();
                    break;

                case 3:
                    checkBookings();
                    break;

                case 4:
                    viewAllCars();
                    break;

                case 5:
                    viewAllUsers();
                    break;

                case 6:
                    System.out.println("xptdr");
                    break;

                case 7:
                    System.out.println(" Thank you for visiting READY VEHICLE!!!");
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


    public static void viewAllCars() {
        CarService carService = new CarService();
        System.out.println(Arrays.toString(carService.seeAllCars()));
    }

    public static void viewAllUsers() {
        UserService userService = new UserService();
        System.out.println(Arrays.toString(userService.seeUsers()));
    }

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
                     bookingService.getAllBookings()[i].getUser().getId() == id ) {
                User userBooking = bookingService.getAllBookings()[i].getUser();
                System.out.println("This user: " + userBooking + "has a car booked ");
                break;

            }


        }

        if(empty ) {
            System.out.println("This user:" + " has no cars booked");
        }

    }

    public static void checkBookings() {
        BookingService bookingService = new BookingService();
        Boolean empty = true;
        for (int i = 0; i < bookingService.getAllBookings().length; i++) {
            if (bookingService.getAllBookings()[i] != null) {
                System.out.println(bookingService.getAllBookings()[i]);
                empty = false;
            }
        }
        if (empty) {
            System.out.println("There is no bookings ☹");
        }
    }
}