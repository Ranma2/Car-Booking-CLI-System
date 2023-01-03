package com.ranaelle.booking;

public class BookingService {

    private BookingDAO bookingDAO = new BookingDAO();

    public int addBookings(Booking booking){
       if (booking == null){
           throw new IllegalArgumentException(
                   "Booking cannot be null"
           );
       }


        return 1;
    }

    public Booking[] getAllBookings(){

        return bookingDAO.selectAllBookings();
    }

}
