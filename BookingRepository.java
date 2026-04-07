package com.bwu.moviebooking.repository;

import com.bwu.moviebooking.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    // No extra methods needed for now
}
