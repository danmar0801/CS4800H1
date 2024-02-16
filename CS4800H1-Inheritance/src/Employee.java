public abstract class Employee {
    String firstName;
    String lastName;
    String SocialSecurityNum;
    public String getFirstName() {
        return firstName;
    }

    public Employee(String firstName, String lastName, String socialSecurityNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        SocialSecurityNum = socialSecurityNum;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNum() {
        return SocialSecurityNum;
    }

    public void setSocialSecurityNum(String socialSecurityNum) {
        SocialSecurityNum = socialSecurityNum;
    }

    // Implement a toString method for the Employee class
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + SocialSecurityNum + '\'' +
                // Add other fields here
                '}';
    }
}
