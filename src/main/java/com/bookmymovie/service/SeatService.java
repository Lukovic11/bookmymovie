package com.bookmymovie.service;

import com.bookmymovie.dto.SeatDTO;
import com.bookmymovie.entity.Seat;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SeatService {

    List<SeatDTO> findByIdIn(List<Long> seatIds);

    void save(Seat seat);

    void deleteByMovieHall_Id(Long movieHallId);


}
