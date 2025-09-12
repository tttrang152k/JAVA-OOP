package Q3;

public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    // Getters / Setters (accessors / mutators)
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        if (maxPassengers < 0) {
            throw new IllegalArgumentException("Max passengers cannot be negative.");
        }
        this.maxPassengers = maxPassengers;
    }

    // Polymorphism method: display cruise ship details 
    @Override
    public void print() {
        System.out.printf("Cruise Ship | Name: %-20s | Year Built: %s | Max Passengers: %d passengers%n",
                getName(), getYearBuilt(), maxPassengers);
    }
    
}
