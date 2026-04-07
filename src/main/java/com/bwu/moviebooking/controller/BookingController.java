package com.bwu.moviebooking.controller;

import com.bwu.moviebooking.model.Booking;
import com.bwu.moviebooking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "*")
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    @PostMapping
    public Booking saveBooking(@RequestBody Booking booking) {
        booking.setBookingDate(LocalDateTime.now());
        booking.setStatus("Confirmed");
        return bookingRepository.save(booking);
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}
