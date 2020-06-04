package lesson3.domain;

public class Car extends Vehicles {
    private String carType;
    private int carWeight;
    private double carVenichleVolume;

    public Car() {
    }

    public Car(String carType, int carWeight, double carVenichleVolume) {
        this.carType = carType;
        this.carWeight = carWeight;
        this.carVenichleVolume = carVenichleVolume;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getCarWeight(double random) {
        return carWeight;
    }

    public int setCarWeight(int carWeight) {
        this.carWeight = carWeight;
        return carWeight;
    }

    public double getCarVenichleVolume() {
        return carVenichleVolume;
    }

    public void setCarVenichleVolume(double carVenichleVolume) {
        this.carVenichleVolume = carVenichleVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", carWeight=" + carWeight +
                ", carVenichleVolume=" + carVenichleVolume +
                '}';
    }

    public int setCarWeight() {
        carWeight = (int) (500 + Math.random()*10000);
        return carWeight;
    }

}

