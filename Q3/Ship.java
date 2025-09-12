package Q3;

public class Ship {
    private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    // Getters / Setters (accessors / mutators)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        if (yearBuilt == null || yearBuilt.isEmpty()) {
            throw new IllegalArgumentException("Year built cannot be null or empty.");
        }
        this.yearBuilt = yearBuilt;
    }

    // Polymorphism method
    public void print() {
        System.out.printf("Ship        | Name: %-20s | Year Built: %s%n", name, yearBuilt);
    }
}
