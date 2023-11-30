package com.bookmymovie.rest;

import com.bookmymovie.entity.Booking;
import com.bookmymovie.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping()
    @Transactional
    public List<Booking> findAll(){
        return bookingService.findAll();
    }

    @GetMapping("/byUserId/{userId}")
    @Transactional
    public List<Booking> findByUserId(@PathVariable Long userId) {
        return bookingService.findByUserId(userId);
    }

    @PutMapping
    @Transactional
    public void save(@RequestBody Booking booking) {
        bookingService.save(booking);
    }

    @DeleteMapping("/byId/{id}")
    @Transactional
    public void deleteById(@PathVariable Long id) {
        bookingService.deleteById(id);
    }

    @DeleteMapping("/byMovieId/{movieId}")
    @Transactional
    public void deleteByMovieId(@PathVariable Long movieId) {
        bookingService.deleteByMovieId(movieId);
    }
    @DeleteMapping("/byUserId/{userId}")
    @Transactional
    public void deleteByUser_Id(@PathVariable Long userId) {
        bookingService.deleteByUser_Id(userId);
    }

}
