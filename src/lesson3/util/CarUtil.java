package lesson3.util;

import lesson3.domain.Car;
import lesson3.domain.CarType;

import java.math.RoundingMode;

import static java.lang.System.*;
import static lesson3.domain.CarType.*;
import static lesson3.domain.CarType.PASSENGER_CAR;


public class CarUtil {


    public static Car  generateCar () {
        Car car = new Car();
        car.setCarWeight();
        determineCarType(car);
        return car;
    }

        public static void  determineCarType (Car car) {
        int a = car.setCarWeight();
        for (int i = 500; i < a; i++) {
            if (i < 2500) {
                car.setCarType(PASSENGER_CAR);
                car.setCarVenichleVolume(Math.round(Math.random()*5) + 1);
            }
            if (i < 5000 && i > 2500) {
                car.setCarType(JEEP);
                car.setCarVenichleVolume(Math.round(Math.random()*10) + 3);
            }
            if (i < 10000 && a > 5000) {
                car.setCarType(TRUCK);
                car.setCarVenichleVolume(Math.round(Math.random()*20 + 10));
            }
        }
    }

    public static void showCar (Car car) {
        System.out.println(car);
    }

    public static void showCars(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }


    public static Car[] generateCars(int num) {
        Car[] cars = new Car[num];
        for (int i = 0; i < num; i++) {
            cars[i] = generateCar();
        }
        return cars;
    }
}
