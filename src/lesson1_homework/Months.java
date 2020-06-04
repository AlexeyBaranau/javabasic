package lesson1_homework;

public enum Months {
    JANUARY ("January"), FEBRUARY ("February"), MARCH ("March"), APRIL ("April"), MAY ("May"),
    JUNE ("June"), JULY ("July"), AUGUST ("August"), SEPTEMBER ("September"), OCTOBER("October"),
    NOVEMBER ("November"), DECEMBER ("December");

    private String month;

    Months(String month) {
        this.month = month;
    }
}
