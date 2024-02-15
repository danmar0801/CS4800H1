public class SalariedEmployee extends Employee{
    int WeeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNum, int weeklySalary) {
        super(firstName, lastName, socialSecurityNum);
        this.WeeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return WeeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        WeeklySalary = weeklySalary;
    }
}
