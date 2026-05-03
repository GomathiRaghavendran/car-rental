package edu.hyf.car_rental.Repositories;

import edu.hyf.car_rental.Model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface RentalRepository
        extends JpaRepository<Rental, Long> {

    boolean existsByCarIdAndStartDateLessThanEqualAndReturnDateGreaterThanEqual(
            Long carId,
            LocalDate returnDate,
            LocalDate startDate
    );
}