package lesson3.util;

import lesson3.domain.Car;

import java.math.RoundingMode;


public class CarUtil {


    public static Car  generateCar () {
        Car car = new Car();
        int a = car.setCarWeight();
        for (int i = 500; i < a; i++) {
            if (i < 2500) {
                car.setCarType("Легковая");
                car.setCarVenichleVolume(Math.round(1+Math.random()*5));
            }
            if (i < 5000 && i > 2500) {
                car.setCarType("Джип");
                car.setCarVenichleVolume(Math.round(3+Math.random()*10));
            }
            if (i < 10000 && a > 5000) {
                car.setCarType("Грузовая");
                car.setCarVenichleVolume(Math.round(10+Math.random()*20));
            }
        }
        return car;
    }

    public static void showCar (Car car) {
        System.out.println(car);
    }
}
