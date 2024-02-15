public class Main {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Lusitania", "1906");
        ships[1] = new CruiseShip("Harmony of the Seas", "2016", 5479);
        ships[2] = new CargoShip("Emma Maersk", "2006", 156907);

        for (Ship ship : ships) {
            ship.printInfo(); // Polymorphic call to print method
        }
    }
}