package lesson3.domain;

public enum CarType {
    PASSENGER_CAR("Passenger car"), JEEP("Jeep"), TRUCK("Truck");

    private String carType;

    CarType(String carType) { this.carType = carType; }

    public String getCarType() { return carType; }

}
