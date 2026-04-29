package edu.hyf.car_rental.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class RentalRequestDTO {
    private Long rentalId;

    private LocalDate startDate;

    private LocalDate returnDate;

    private Long carId;
}

