import java.util.ArrayList;

public class SalesManager extends Employee {
    double salary;
    SalesManager manager;
    ArrayList<Employee> employees;

    public SalesManager(int employeeID, String employeeName, ArrayList<Customer> myCustomers, double salary, SalesManager manager, ArrayList<Employee> employees) {
        super(employeeID, employeeName, myCustomers);
        this.salary = salary;
        this.manager = manager;
        this.employees = employees;
    }

    public void addEmployees(Employee employee) {
        employees.add(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public double totalSales() {
        double A = 0, B = 0;

            A = getEmployees().size();
            B = getCustomers().size();

       // System.out.println("employees: " + getEmployees().size() + " customers: " + getCustomers().size());
        return ((A * 500) + (B * 200));
    }

    public double getSalary() {
        return salary;
    }

    public SalesManager getManager() {
        return manager;
    }

    public void setSalary(double salary) {
        salary = 75000;
        this.salary = salary;
    }

    @Override
    public void setManager(SalesManager manager) {
        this.manager = manager;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}