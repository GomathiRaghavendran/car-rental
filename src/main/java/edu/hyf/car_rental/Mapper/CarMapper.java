package edu.hyf.car_rental.Mapper;

import edu.hyf.car_rental.DTO.CarRequestDTO;
import edu.hyf.car_rental.DTO.CarResponseDTO;
import edu.hyf.car_rental.Model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CarMapper {


    CarResponseDTO toResponseDTO(Car car);

    Car toEntity(CarRequestDTO dto);
}