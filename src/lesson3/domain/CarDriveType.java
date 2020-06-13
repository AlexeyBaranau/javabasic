package lesson3.domain;

enum CarDriveType {
    FOURWHEELDRIVE ("four-wheel drive car"), FRONTWHEELDRIVE ("front-wheel drive car"), REARDRIVE("rear drive car");

    private String carDriveType;

    CarDriveType(String carType) {
        this.carDriveType = carType;
    }


    public String getCarType() {
        return carDriveType;
    }

    public static void printAllValues() {
        for (CarDriveType value : values()) {
            System.out.println(value + " " + value.ordinal() + " " + value.getCarType());
        }
    }
}
