package lesson3.util;

import lesson3.domain.Car;


public class CarUtil {


    public static Car  generateCar () {
        Car car = new Car();
        int a = car.setCarWeight();
        for (int i = 500; i < a; i++) {
            if (i < 2500) {
                car.setCarType("Легковая");
                car.setCarVenichleVolume(2.0f);
            }
            if (i < 5000 && i > 2500) {
                car.setCarType("Джип");
                car.setCarVenichleVolume(5.0f);
            }
            if (i < 10000 && a > 5000) {
                car.setCarType("Грузовая");
                car.setCarVenichleVolume(10.0f);
            }
        }
        return car;
    }

    public static void showCar (Car car) {
        System.out.println(car);
    }
}
