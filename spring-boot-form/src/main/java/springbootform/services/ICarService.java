package springbootform.services;

import java.util.List;
import java.util.Optional;

import springbootform.model.Car;

public interface ICarService {
	Car addCar(Car newCar);

	List<Car> getCarList();

	Optional<Car> getCar(Long id);

}
