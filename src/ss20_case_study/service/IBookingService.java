package ss20_case_study.service;

import ss20_case_study.model.Booking;

import java.util.Set;

public interface IBookingService {
    Set<Booking> getBooking();
    void addBooking(Booking booking);
    void createContract();
}
