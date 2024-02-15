public class CargoShip extends Ship{
    private int cargoCapcity;

    public CargoShip(String nameOfShip, String yearBuilt, int maxNumOfPassengers) {
        super(nameOfShip, yearBuilt);
        this.cargoCapcity = maxNumOfPassengers;
    }

    public int getCargoCapcity() {
        return cargoCapcity;
    }

    public void setCargoCapcity(int cargoCapcity) {
        this.cargoCapcity = cargoCapcity;
    }

    @Override
    public void  printInfo() {
        System.out.println("Cargo Ship Name is: " + getNameOfShip());
        System.out.println("year Cargo Ship Built: " + getYearBuilt());
        System.out.println("Cargo Capacity in tonnage: " + getCargoCapcity());
    }
}
