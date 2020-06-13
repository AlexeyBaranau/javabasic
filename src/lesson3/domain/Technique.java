package lesson3.domain;

import java.util.Random;

public abstract class Technique {

    protected double techniqueCost;
    protected String  techniqueCountryofOrigin;

    public Technique() {
    }

    public Technique(double techniqueCost, String techniqueCountryofOrigin) {
        this.techniqueCost = techniqueCost;
        this.techniqueCountryofOrigin = techniqueCountryofOrigin;
    }

    public double getTechniqueCost() {
        return techniqueCost;
    }

    public void setTechniqueCost(double techniqueCost) {
        this.techniqueCost = techniqueCost;
    }

    public String getTechniqueCountryofOrigin() {
        return techniqueCountryofOrigin;
    }

    public String setTechniqueCountryofOrigin(String techniqueCountryofOrigin) {
        String [] countries = {"Belarus", "Russia", "China", "Germany", "USA", "Sweden", "Great Britain"};
        int randomIndex = new Random().nextInt(countries.length);
        this.techniqueCountryofOrigin = countries[randomIndex];
        return techniqueCountryofOrigin;
    }

//    public String setTechniqueCountryOfOrigin () {
//        String [] countries = {"Belarus", "Russia", "China", "Germany", "USA", "Sweden", "Great Britain"};
//        int randomIndex = new Random().nextInt(countries.length);
//        String techniqueCountryofOrigin = countries[randomIndex];
//        return techniqueCountryofOrigin;
//    }

}


