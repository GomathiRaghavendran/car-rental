package edu.hyf.car_rental.Mapper;

import edu.hyf.car_rental.DTO.RentalRequestDTO;
import edu.hyf.car_rental.DTO.RentalResponseDTO;
import edu.hyf.car_rental.Model.Rental;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RentalMapper {

    @Mapping(source = "car.id", target = "carId")
    RentalResponseDTO toResponseDTO(Rental rental);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "car", ignore = true)
    Rental toEntity(RentalRequestDTO dto);
}

