public class Driver {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Ali", "Khan", "111-11-1111");
        employees[1] = new Employee("Sara", "Ahmed", "222-22-2222");

        employees[2] = new SalariedEmployee("John", "Smith", "333-33-3333", 800.00);
        employees[3] = new SalariedEmployee("Ayesha", "Malik", "444-44-4444", 1200.00);

        employees[4] = new HourlyEmployee("Bilal", "Hussain", "555-55-5555", 16.75, 40);
        employees[5] = new HourlyEmployee("Zainab", "Ali", "666-66-6666", 20.00, 50);

        employees[6] = new CommissionEmployee("Usman", "Tariq", "777-77-7777", 10000, 0.06);
        employees[7] = new CommissionEmployee("Fatima", "Noor", "888-88-8888", 20000, 0.10);

        employees[8] = new BasePlusCommissionEmployee("Hassan", "Raza", "999-99-9999", 5000, 0.04, 300);
        employees[9] = new BasePlusCommissionEmployee("Maryam", "Javed", "101-10-1010", 8000, 0.05, 500);

        System.out.println("Employees processed polymorphically:\n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee.toString());

            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                double oldBase = employee.getBaseSalary();
                employee.setBaseSalary(oldBase * 1.10);
                System.out.printf("New base salary with 10%% increase is: $%.2f\n", employee.getBaseSalary());
            }

            System.out.printf("Earnings: $%.2f\n\n", currentEmployee.earnings());
        }

        System.out.println("--- Types of Objects ---");
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("Employee %d is a %s\n", i, employees[i].getClass().getName());
        }
    }
}