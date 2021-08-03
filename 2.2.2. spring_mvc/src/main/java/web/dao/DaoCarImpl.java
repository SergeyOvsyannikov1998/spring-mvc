package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DaoCarImpl implements DaoCar{
    private final List<Car> list;
    {
        list = new ArrayList<>();
        list.add(new Car("Sergey", "Ford", "1"));
        list.add(new Car("Michail", "Volvo", "2"));
        list.add(new Car("Vladimir", "Nissan", "3"));
        list.add(new Car("Dmitriy", "Lada", "4"));
        list.add(new Car("Nikolay", "Toyota", "5"));
    }
    @Override
    public List<Car> getObj(int count) {
        if (count>=5){
            return list;
        } else {
            List<Car> doubleList = list.stream().limit(count).collect(Collectors.toList());
            return doubleList;
        }
    }
}
