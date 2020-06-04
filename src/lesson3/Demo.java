package lesson3;

import lesson3.domain.Car;
import lesson3.domain.CarType;
import lesson3.util.CarUtil;

import static java.lang.System.*;

public class Demo {
    public static void main (String [] args) {
        Car car1 = CarUtil.generateCar();
        Car car2 = CarUtil.generateCar();
        Car car3 = CarUtil.generateCar();

        CarUtil.showCar(car1);
        CarUtil.showCar(car2);
        CarUtil.showCar(car3);
        CarType.printAllValues();
    }
}
