package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;
@Service("carServiceImpl")
public class CarServiceImpl implements CarService{
    private final CarDAO carDao;
    @Autowired
    public CarServiceImpl(CarDAO carDao){
        this.carDao = carDao;
    }
    @Override
    public List<Car> getNumberOfCars(int number) {
        return carDao.getAllCars().stream().limit(number).toList();
    }
}
