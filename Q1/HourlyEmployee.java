package Q1;
// HourlyEmployee is a child class of Employee

public class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hoursWorked) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() { return wage; }
    public void setWage(double wage) { this.wage = wage; }

    public double getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(double hoursWorked) { this.hoursWorked = hoursWorked; }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Wage: $%.0f | Hours Worked: %.0f", wage, hoursWorked);
    }
}