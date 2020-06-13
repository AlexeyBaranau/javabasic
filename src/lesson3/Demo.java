package lesson3;

import lesson3.domain.Car;
import lesson3.domain.Technique;
import lesson3.util.CarUtil;

import static lesson3.util.CarUtil.*;

public class Demo {

    public static void main (String [] args) {
        Car car1 = generateCar();

        Car[] cars = generateCars(5);

        showCars(cars);
        showCar(car1);
    }
}
