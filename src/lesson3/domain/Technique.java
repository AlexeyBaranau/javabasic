package lesson3.domain;

public abstract class Technique {
    protected String techniqueType;
    protected double techniqueCost;
    protected String techniqueCountryofOrigin;

    public Technique () {
    }

    public Technique(String techniqueType, double techniqueCost, String techniqueCountryofOrigin) {
        this.techniqueType = techniqueType;
        this.techniqueCost = techniqueCost;
        this.techniqueCountryofOrigin = techniqueCountryofOrigin;
    }
}
