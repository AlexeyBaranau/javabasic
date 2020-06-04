package lesson3.domain;

public enum CarType {
    FOURWHEELDRIVE ("four-wheel drive car"), FRONTWHEELDRIVE ("front-wheel drive car"), REARDRIVE("rear drive car");

    private String carType;

    CarType(String carType) {
        this.carType = carType;
    }


    public String getCarType() {
        return carType;
    }

    public static void printAllValues() {
        for (CarType value : CarType.values()) {
            System.out.println(value + " " + value.ordinal() + " " + value.getCarType());
        }
    }
}
