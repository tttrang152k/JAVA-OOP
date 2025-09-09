package Q1;
// Superclass representing a generic employees
public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
    }

    // Getters and setter
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getSSN() { return socialSecurityNumber; }
    public void setSSN(String socialSecurityNumber) { this.socialSecurityNumber = socialSecurityNumber; }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-11s", firstName, lastName, socialSecurityNumber);
    }
}