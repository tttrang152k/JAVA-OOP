package Q1;
// Driver program for Employee hierarchy

public class EmployeeDriver {
    public static void main(String[] args) {
        // Create instances of each employee type
        Employee[] employees = new Employee[7];
        employees[0] = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        employees[1] = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        employees[2] = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        employees[3] = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        employees[4] = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        employees[5] = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        employees[6] = new CommissionEmployee("John", "Black", "777-77-7777", 22, 40000);

        // Print header
        System.out.printf("Employee Details:%n");
        System.out.println("---------------------------------------------------------------");

        // Print each employee's details
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}