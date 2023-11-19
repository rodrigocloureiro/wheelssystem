package br.com.wheels.service.impl;

import br.com.wheels.model.Bike;
import br.com.wheels.repository.BikeRepository;
import br.com.wheels.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
public class BikeServiceImpl implements BikeService {
    @Autowired
    BikeRepository bikeRepository;

    @Override
    public Bike getBikeById(int id) {
        return bikeRepository.findById(id);
    }

    @Override
    public List<Bike> getAllBikes() {
        return bikeRepository.findAll();
    }

    @Override
    public Bike getBikeByModel(String model) {
        return bikeRepository.findByModelo(model);
    }

    @Override
    public Bike saveBike(Bike bike) {
        return bikeRepository.save(bike);
    }
}
