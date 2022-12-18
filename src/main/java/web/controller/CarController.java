package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.Optional;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        if(count == null){
            model.addAttribute("cars", carService.getCars());
        } else {
            model.addAttribute("cars", carService.getCarsWithParam(count));
        }
        return "cars";
    }
}
