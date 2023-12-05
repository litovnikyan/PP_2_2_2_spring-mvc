package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.Service.CarServiceImp;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        CarService cars = new CarServiceImp();
        if (count == null) {
            model.addAttribute("cars", cars.getCarList(5));
        } else {
            model.addAttribute("cars", cars.getCarList(count));
        }
        return "cars";
    }
}


