package com.moviebooking.theatreservice.repositories;

import com.moviebooking.theatreservice.entities.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<Theatre,Integer> {
}
