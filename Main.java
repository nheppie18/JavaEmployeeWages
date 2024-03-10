import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("This Program will create and display a list of employees and their payroll report.");
        System.out.println();
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Hourly Steven = new Hourly(15.00, 30, "Steven Sellers");
        employees.add(Steven);
        Hourly John = new Hourly(12.50, 40, "John Johnson");
        employees.add(John);
        Salaried Sally = new Salaried(100000, "Sally Seashells");
        employees.add(Sally);
        System.out.println("Payroll Report");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Employee: " + employees.get(i).getName());
            System.out.println("Gross Pay: $" + String.format("%.2f", employees.get(i).getGrossPay()));
            System.out.println("Federal Withholding: $" + String.format("%.2f", employees.get(i).getFedWithholding()));
            System.out.println("State Withholding: $" + String.format("%.2f", employees.get(i).getStateWithholding()));
            System.out.println("Net Pay: $" + String.format("%.2f", employees.get(i).getNetPay()));
            System.out.println();
        }
    }
}

