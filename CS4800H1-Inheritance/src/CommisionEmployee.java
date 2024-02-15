public class CommisionEmployee extends Employee{
    int comRate;
    int grossSalary;

    public CommisionEmployee(String firstName, String lastName, String socialSecurityNum, int comRate, int grossSalary) {
        super(firstName, lastName, socialSecurityNum);
        this.comRate = comRate;
        this.grossSalary = grossSalary;
    }

    public int getComRate() {
        return comRate;
    }

    public void setComRate(int comRate) {
        this.comRate = comRate;
    }

    public int getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(int grossSalary) {
        this.grossSalary = grossSalary;
    }
}
