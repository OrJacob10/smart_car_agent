package com.example.SmartCarAgent.service;

import com.example.SmartCarAgent.model.Car;
import com.example.SmartCarAgent.repo.CarRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CarService {
    private CarRepository carRepository;

    public Iterable<Car> getAllCars(){
        return this.carRepository.findAll();
    }

    public Optional<Car> getCar(int id){
        return this.carRepository.findById(id);
    }

    public void addCar(Car car){
        this.carRepository.save(car);
    }

    public void deleteCar(int id){
        this.carRepository.deleteById(id);
    }

}
