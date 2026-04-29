package edu.hyf.car_rental.Repositories;

import edu.hyf.car_rental.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface CarRepository
            extends JpaRepository<Car, Long> {

        List<Car> findByIsRented(Boolean isRented);
    }

