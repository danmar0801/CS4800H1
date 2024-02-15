public class CruiseShip extends Ship{
    private int maxNumOfPassengers;

    public CruiseShip(String nameOfShip, String yearBuilt, int maxNumOfPassengers) {
        super(nameOfShip, yearBuilt);
        this.maxNumOfPassengers = maxNumOfPassengers;
    }

    public int getMaxNumOfPassengers() {
        return maxNumOfPassengers;
    }

    public void setMaxNumOfPassengers(int maxNumOfPassengers) {
        this.maxNumOfPassengers = maxNumOfPassengers;
    }

    @Override
    public void printInfo() {
          System.out.println("Cruise Ship Name is: " + getNameOfShip());
          System.out.println("year Cruise Ship Built: " + getYearBuilt());
          System.out.println("Max Number Of Passengers: " + getMaxNumOfPassengers());
    }
}