package br.com.wheels.service;

import br.com.wheels.model.Bike;

import java.util.List;

public interface BikeService {
    Bike getBikeById(int id);

    List<Bike> getAllBikes();

    Bike getBikeByModel(String model);

    Bike saveBike(Bike bike);
}
