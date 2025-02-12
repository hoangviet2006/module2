package ss20_case_study.service.impl;

import ReadAndWriteFile.ReadAndWriteFile;
import ss20_case_study.model.Booking;
import ss20_case_study.service.IBookingService;

import java.util.*;

public class BookingService implements IBookingService {
    private static final String BOOKING_FILE = "D:\\codegym\\module2\\src\\ss20_case_study\\data\\contract.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;

    private static Set<Booking> bookings = new LinkedHashSet<>();


    @Override
    public Set<Booking> getBooking() {
        return bookings;
    }

    @Override
    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    @Override
    public void createContract() {
        Queue<Booking> bookingQueue = new ArrayDeque<>();
        for (Booking booking : bookings) {
            bookingQueue.add(booking);
        }

        List<String> stringList = new ArrayList<>();
        while (!bookingQueue.isEmpty()) {
            stringList.add(bookingQueue.poll().getInfoToFile());
        }
        ReadAndWriteFile.writeFile(BOOKING_FILE,stringList,APPEND);
        bookings.clear();
    }

}
