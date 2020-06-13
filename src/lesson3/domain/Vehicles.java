package lesson3.domain;

public class Vehicles extends Technique {

    protected String typeOfVehicles;
    protected int speedOfVehicles;

    public Vehicles() {
        this.typeOfVehicles = typeOfVehicles;
        this.speedOfVehicles = speedOfVehicles;
    }

    public String getTypeOfVehicles() {
        return typeOfVehicles;
    }

    public void setTypeOfVehicles(String typeOfVehicles) {
        this.typeOfVehicles = typeOfVehicles;
    }

    public int getSpeedOfVehicles() {
        return speedOfVehicles;
    }

    public void setSpeedOfVehicles(int speedOfVehicles) {
        this.speedOfVehicles = speedOfVehicles;
    }
}
