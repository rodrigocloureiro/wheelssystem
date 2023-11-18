package br.com.wheels.repository;

import br.com.wheels.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer> {
    Bike findById(int id);
    Bike findByModelo(String model);
}
