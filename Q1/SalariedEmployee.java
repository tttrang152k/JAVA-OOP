package Q1;
// SalariedEmployee is child class of Employee

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() { return weeklySalary; }
    public void setWeeklySalary(double weeklySalary) { this.weeklySalary = weeklySalary; }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Weekly Salary: $%,.2f", weeklySalary);
    }
}