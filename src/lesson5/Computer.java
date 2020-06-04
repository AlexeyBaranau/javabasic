package lesson5;

public class Computer {
    private String someField;
    private Long computerId;

    public Computer() {
    }

    public Computer(String someField, Long computerId) {
        this.someField = someField;
        this.computerId = computerId;
    }

    public String getSomeField() {
        return someField;
    }

    public void setSomeField(String someField) {
        this.someField = someField;
    }

    public Long getComputerId() {
        return computerId;
    }

    public void setComputerId(Long computerId) {
        this.computerId = computerId;
    }

    class PowerSupply {
        private Long powerSupply;

        PowerSupply(Long powerSupply) {
            this.powerSupply = powerSupply;
        }
    }
}
