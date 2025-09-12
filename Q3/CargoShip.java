package Q3;

public class CargoShip extends Ship {
    private int cargoCapacity; // in tons

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    // Getters / Setters (accessors / mutators)
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        if (cargoCapacity < 0) {
            throw new IllegalArgumentException("Cargo capacity cannot be negative.");
        }
        this.cargoCapacity = cargoCapacity;
    }

    // Polymorphism method: display cargo ship details 
    @Override
    public void print() {
        System.out.printf("Cargo Ship  | Name: %-20s | Year Built: %s | Cargo Capacity: %d tons%n",
                getName(), getYearBuilt(), cargoCapacity);
    }
    
}
