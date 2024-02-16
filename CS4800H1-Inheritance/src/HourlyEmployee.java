public class HourlyEmployee extends Employee{
    int wage;
    int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNum, int wage, int hoursWorked) {
        super(firstName, lastName, socialSecurityNum);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + ", hoursWorked= " + hoursWorked+ ", " + "wage= "+ wage;
    }
}
