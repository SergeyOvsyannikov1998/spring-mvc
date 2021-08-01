package web.service;

import web.dao.DaoCar;
import web.dao.DaoCarImpl;
import web.model.Car;

import java.util.List;

public class ServiceCarImpl implements ServiceCar{
    private DaoCar daoCar = new DaoCarImpl();
    @Override
    public List<Car> getCar(int count) {
        return daoCar.getObj(count);
    }
}
