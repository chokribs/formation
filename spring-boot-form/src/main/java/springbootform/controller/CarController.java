package springbootform.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootform.model.Car;
import springbootform.services.ICarService;

@RestController
@RequestMapping(value = "/api")
public class CarController {
	private static final Logger logger = LoggerFactory.getLogger(CarController.class);
	@Autowired
	ICarService carService ;
	
	@PostMapping("/car")
	public Car addCar(@RequestBody Car item) {
		logger.debug("Debug: addCar: {}",item);
		logger.info("info: addCar: {}",item);
	
		return carService.addCar(item);
	}
	@GetMapping("/car")
	public List<Car> getCarList(){
		logger.debug("###### getCarList################");
		return carService.getCarList();
	}
	@GetMapping("/car/{id}")
	public Car getCar(@PathVariable Long id) {
		logger.debug("getCar: id={}",id);
		 Optional<Car> result = carService.getCar(id);
		 if(result.isPresent()) return result.get();
		return null;
	}
	
	/*
	@GetMapping("/hello/{firstname}/{lastname}")
	public String hello(@PathVariable String firstname,@PathVariable String lastname) {
		return "GET:Hello "+firstname+" "+lastname;
	}
	@PostMapping("/hello/{firstname}/{lastname}")
	public String helloOne(@PathVariable String firstname,@PathVariable String lastname) {
		return "POST: Hello "+firstname+" "+lastname;
	}
	@GetMapping("/hello2")
	public String helloTwo() {
		return "Hello chokri2";
	}
	*/

}
