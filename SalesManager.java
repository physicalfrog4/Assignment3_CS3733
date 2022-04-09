import java.util.ArrayList;

public class SalesManager extends Employee {
    ArrayList<Employee> employees;

    public SalesManager(int employeeID, String employeeName, ArrayList<Customer> myCustomers, double salary, SalesManager manager, ArrayList<Employee> employees) {
        super(employeeID, employeeName, myCustomers);
        this.salary = 75000;
        this.manager = manager;
        this.employees = employees;
    }

    public void addEmployees(Employee employee) {
        employees.add(employee);
    }

    public ArrayList<Employee> getEmployees(){
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
        this.salary = salary;
    }

    @Override
    public void setManager(SalesManager manager) {
        this.manager = manager;
    }

    /**
     * for reference %s means insert string and %d is insert double.
     * @return
     */
    @Override
    public String toString() {
        StringBuilder employeeString = new StringBuilder();
        for (int i = 0; i < employees.size(); i++) {
            employeeString.append(String.format("%s %d", employees.get(i).getEmployeeName(), employees.get(i).getEmployeeID()));
            if (i != employees.size() - 1) {
                employeeString.append(", ");
            }
        }
        String myManageName;
        if (this.manager == null) {
            myManageName = "null";
        } else {
            myManageName = this.manager.getEmployeeName();
        }
        return String.format(
                "Sales Manager: %s. Manager: %s. Employees: %s. Total Sales: %.0f",
                this.employeeName, myManageName, employeeString.toString(), totalSales());
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}