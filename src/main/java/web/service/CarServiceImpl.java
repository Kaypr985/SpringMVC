package web.service;

import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Camry", "Toyota", 2020));
        cars.add(new Car("Model 3", "Tesla", 2021));
        cars.add(new Car("Golf", "Volkswagen", 2019));
        cars.add(new Car("Civic", "Honda", 2022));
        cars.add(new Car("Focus", "Ford", 2018));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
