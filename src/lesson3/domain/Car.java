package lesson3.domain;

public class Car extends Vehicles {
    public static final String CAR_OWNER = "Alexey";

    private CarType carType;
    private int carWeight;
    private double carVenichleVolume;
    private int carMaxSpeed;

    public Car() {
    }

    public Car(CarType carType, int carWeight, double carVenichleVolume) {
        this.carType = carType;
        this.carWeight = carWeight;
        this.carVenichleVolume = carVenichleVolume;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getCarWeight(double random) {
        return carWeight;
    }

    public int setCarWeight(int carWeight) {
        this.carWeight = carWeight;
        return carWeight;
    }

    public int setCarWeight() {
        carWeight = (int) (Math.random()*10000 + 500);
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
                "carType=" + carType +
                ", carWeight=" + carWeight +
                ", carVenichleVolume=" + carVenichleVolume +
                ", carMaxSpeed=" + carMaxSpeed +
                ", typeOfVehicles='" + typeOfVehicles + '\'' +
                ", speedOfVehicles=" + speedOfVehicles +
                ", techniqueCost=" + techniqueCost +
                ", techniqueCountryofOrigin='" + techniqueCountryofOrigin + '\'' +
                '}';
    }

}

