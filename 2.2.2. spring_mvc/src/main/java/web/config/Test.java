package web.config;

import web.model.Car;
import web.service.ServiceCar;
import web.service.ServiceCarImpl;

import java.util.List;

public class Test {
    private static ServiceCar serviceCar = new ServiceCarImpl();
    public static List<Car> cars = serviceCar.getCar(5);
}
