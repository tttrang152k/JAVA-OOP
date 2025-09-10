package Q2;

class Freelancer implements Payable {
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

    // Accessors / Mutators with validation
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) throw new IllegalArgumentException("Hourly rate cannot be negative.");
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) throw new IllegalArgumentException("Hours worked cannot be negative.");
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double regularHours = Math.min(40, hoursWorked);
        return (regularHours * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
    }

    @Override
    public String getPayeeName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return String.format(
            "Freelancer  | %-15s | Rate: $%.2f | Hours: %.2f | Payment: $%,.2f",
            getPayeeName(), hourlyRate, hoursWorked, calculatePayment()
        );
    }
}
