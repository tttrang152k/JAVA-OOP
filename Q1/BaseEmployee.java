package Q1;
// BaseEmployee.java

public class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String ssn, double baseSalary) {
        super(firstName, lastName, ssn);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Base Salary: $%,.2f", baseSalary);
    }
}
