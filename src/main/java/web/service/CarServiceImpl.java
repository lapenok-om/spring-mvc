package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Lada", 1, 1999));
        cars.add(new Car("Toyota", 2, 2007));
        cars.add(new Car("Lada", 3, 2002));
        cars.add(new Car("Reno", 1, 2010));
        cars.add(new Car("Golf", 5, 2015));

    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCarsWithParam(int count) {
        if(count >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0,count);
        }
    }
}
