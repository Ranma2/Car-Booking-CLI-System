package com.ranaelle.booking;

public class BookingDAO {
    private static Booking[] bookings;
    private static int index = 0;
    private static int CAPACITY = 3;

    static {
        bookings = new Booking[CAPACITY];
    }

    public void saveBookings(Booking booking) {
        if (index >= CAPACITY) { //expands the array if it is full
           resize(CAPACITY + 1);
        }
            bookings[index] = booking;
            index++;

    }
    public void resize(int newCapacity){
        CAPACITY = newCapacity;
        Booking[] bigBookings = new Booking[CAPACITY];
        for (int i = 0; i < index; i++){
            bigBookings[i] = bookings[i];
        }
        bookings = bigBookings;
    }

    public Booking[] selectAllBookings(){
        return bookings;
    }

}
