package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImp implements CarDAO{
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Toyota", "Corolla", "white"));
        cars.add(new Car("Kia", "Rio", "blue"));
        cars.add(new Car("VW", "Passat", "silver"));
        cars.add(new Car("Mersedes", "E-klass", "black"));
        cars.add(new Car("BMW", "5-series", "red"));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
