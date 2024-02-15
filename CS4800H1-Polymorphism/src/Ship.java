public class Ship {
    private String nameOfShip;
    private String yearBuilt;

    public Ship(String nameOfShip, String yearBuilt) {
        this.nameOfShip = nameOfShip;
        this.yearBuilt = yearBuilt;
    }

    public String getNameOfShip() {
        return nameOfShip;
    }

    public void setNameOfShip(String nameOfShip) {
        this.nameOfShip = nameOfShip;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void printInfo(){
        System.out.println("Ship Name is: " + getNameOfShip());
        System.out.println("year Ship Built: " + getYearBuilt());
    }
}
