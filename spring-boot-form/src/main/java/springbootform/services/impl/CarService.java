package springbootform.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootform.model.Car;
import springbootform.repositories.CarRepository;
import springbootform.services.ICarService;
@Service
public class CarService implements ICarService{
	private  Long counter=0L;
	@Autowired
	private CarRepository carRepository;
	@Override
	public Car addCar(Car newCar) {
		counter++;
		newCar.setId(counter);		
		return carRepository.save(newCar);
	}
	@Override
	public List<Car> getCarList() {

		return carRepository.findAll();
	}
	@Override
	public Optional<Car> getCar(Long id) {

		return carRepository.findById(id);
	}

}
