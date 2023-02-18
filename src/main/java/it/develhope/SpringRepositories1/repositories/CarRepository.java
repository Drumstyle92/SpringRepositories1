package it.develhope.SpringRepositories1.repositories;

import it.develhope.SpringRepositories1.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Drumstyle92
 * Interface that extends another interface in such a way that you have a ready-to-use automated CRUD
 */
@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car,Long> {

}
