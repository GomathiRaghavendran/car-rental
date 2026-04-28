package edu.hyf.car_rental.Mapper;

import edu.hyf.car_rental.DTO.CarDto;
import edu.hyf.car_rental.Model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public class CarMapper {

    CarMapper cm = Mappers.getMapper(CarMapper.class);

    CarDto toDTO(Car car) {
        return null;
    }

    Car toEntity(CarDto carDto) {
        return null;
    }

}
