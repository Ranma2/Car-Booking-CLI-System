package com.ranaelle.booking;

import java.time.LocalDateTime;
import java.util.UUID;

public class BookingService {

    private BookingDAO bookingDAO = new BookingDAO();

    public int addBookings(Booking booking){
       if (booking == null){
           throw new IllegalArgumentException(
                   "Booking cannot be null"
           );
       }else{
           bookingDAO.saveBookings(booking);
       }


        return 1;
    }

    public String generateBookingRef(){
        Booking booking = new Booking();

        UUID uuid = UUID.randomUUID();
        String bookingRef = uuid.toString();
        return bookingRef;
    }

    public LocalDateTime generateBookingDate(){
        LocalDateTime bookingDate = LocalDateTime.now();
       return bookingDate;
    }



    public Booking[] getAllBookings(){

        return bookingDAO.selectAllBookings();
    }

}
