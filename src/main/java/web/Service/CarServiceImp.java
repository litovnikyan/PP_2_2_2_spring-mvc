package web.Service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Ford", "Black", 258));
        carList.add(new Car("BMW", "Red", 845));
        carList.add(new Car("Lada", "White", 369));
        carList.add(new Car("KIA", "Green", 123));
        carList.add(new Car("Toyota", "Blue", 895));
    }

    @Override
    public List<Car> getCarListByCount(int quantity) {
        if (quantity > 1 && quantity <= 5) {
            return carList.stream().limit(quantity).toList();
        }
        return carList;
    }
}
