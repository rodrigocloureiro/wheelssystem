package br.com.wheels.service;

import br.com.wheels.model.Bike;

public interface BikeService {
    Bike getBikeById(int id);
    Bike getBikeByModel(String model);
    Bike saveBike(Bike bike);
}
