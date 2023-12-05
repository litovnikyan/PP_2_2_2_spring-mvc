package web.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {


    @Override
    public List<Car> getCarList(int quantity) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Ford", "Black", 258));
        carList.add(new Car("BMW", "Red", 845));
        carList.add(new Car("Lada", "White", 369));
        carList.add(new Car("KIA", "Green", 123));
        carList.add(new Car("Toyota", "Blue", 895));

        if (quantity > 1 && quantity <= 5) {
            List<Car> customCarList = new ArrayList<>();
            for (int i = 0; i < quantity; i++) {
                customCarList.add(carList.get(i));
            }
            return customCarList;
        }
        return carList;
    }
}
