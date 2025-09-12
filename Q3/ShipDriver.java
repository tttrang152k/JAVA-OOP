package Q3;

public class ShipDriver {
    public static void main(String[] args) {
        // Create a static array of Ship references
        Ship[] ships = new Ship[3];

        // Populate the array with Ship, CargoShip and CruiseShip objects
        ships[0] = new Ship("Oceanic", "1988");
        ships[1] = new CargoShip("SS Atlantic Conveyor", "2005", 5000);
        ships[2] = new CruiseShip("Icon of the Sea", "2010", 3000);

        // Display details of each ship using polymorphism
        for (Ship ship : ships) {
            ship.print();
        }
    }
}
