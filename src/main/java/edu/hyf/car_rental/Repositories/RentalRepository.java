package edu.hyf.car_rental.Repositories;

import edu.hyf.car_rental.Model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository
        extends JpaRepository<Rental, Long> {
}