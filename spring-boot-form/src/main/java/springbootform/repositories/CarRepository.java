package springbootform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootform.model.Car;
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
