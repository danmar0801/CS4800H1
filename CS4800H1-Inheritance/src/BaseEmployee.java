public class BaseEmployee extends Employee{
    int baseSalary;

    public BaseEmployee(String firstName, String lastName, String socialSecurityNum, int baseSalary) {
        super(firstName, lastName, socialSecurityNum);
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() + ", BaseSalary=" + baseSalary;
    }
}
