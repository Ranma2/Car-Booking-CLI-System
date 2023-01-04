package com.ranaelle.booking;

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

    public void generateBookingRef(){
        UUID uuid = UUID.randomUUID();
        String bookingRef = uuid.toString();
    }

    public void generateBookingDate(){

    }



    public Booking[] getAllBookings(){

        return bookingDAO.selectAllBookings();
    }

}
