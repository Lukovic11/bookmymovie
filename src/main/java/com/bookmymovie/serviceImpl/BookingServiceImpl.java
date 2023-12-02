package com.bookmymovie.serviceImpl;

import com.bookmymovie.dao.BookingRepository;
import com.bookmymovie.dto.BookingDTO;
import com.bookmymovie.entity.Booking;
import com.bookmymovie.mapper.BookingMapper;
import com.bookmymovie.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private BookingMapper bookingMapper;

    @Override
    public List<BookingDTO> findAll() {
        List<BookingDTO> bookings=bookingMapper.toBookingDTOs(bookingRepository.findAll());
        return bookings;
    }

    @Override
    public List<BookingDTO> findByUserId(Long userId) {
        List<BookingDTO> bookings=bookingMapper.toBookingDTOs(bookingRepository.findByUserId(userId));
        return bookings;
    }

    @Override
    public void save(Booking booking) {
        bookingRepository.save(booking);
    }

    @Override
    public void deleteById(Long id) {
        bookingRepository.deleteById(id);
    }

    @Override
    public void deleteByMovieId(Long movieId) {
        bookingRepository.deleteByMovie_Id(movieId);
    }

    @Override
    public void deleteByUser_Id(Long userId) {
        bookingRepository.deleteByUser_Id(userId);
    }
}
