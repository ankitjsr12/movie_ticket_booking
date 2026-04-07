package com.bwu.moviebooking.repository;

import com.bwu.moviebooking.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Long> {

    List<Seat> findByShowIdAndIsBookedFalse(Long showId);
}
