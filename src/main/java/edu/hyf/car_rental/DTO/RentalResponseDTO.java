package edu.hyf.car_rental.DTO;

import edu.hyf.car_rental.Model.Rental;
import edu.hyf.car_rental.Repositories.RentalRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class RentalResponseDTO {


    private Long id;

    private Long rentalId;

    private LocalDate startDate;

    private LocalDate returnDate;

    private Long carId;

}

