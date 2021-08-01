package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.Test;
import web.model.Car;
import web.service.ServiceCar;
import web.service.ServiceCarImpl;

import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String print1Welcome(@RequestParam(value = "count" ,required = false) Integer count, Model model) {
        ServiceCar serviceCar = new ServiceCarImpl();
        if (count!=null){
            List<Car> cars = serviceCar.getCar(count);
            model.addAttribute("cars", cars);
        } else {
            List<Car> cars = serviceCar.getCar(5);
            model.addAttribute("cars", cars);
        }
        return "cars";
    }

}
