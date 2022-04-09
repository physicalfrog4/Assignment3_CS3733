import java.util.ArrayList;

public class SalesAssociate extends Employee{
    double salary;
    SalesManager salesManager;
    ArrayList<Employee> employees;

    public SalesAssociate(double salary, SalesManager salesManager, ArrayList employees) {
        this.salary = salary;
        this.salesManager = salesManager;
        this.employees = employees;
    }

    public double getSalary() {
        return salary;
    }

    public SalesManager getSalesManager() {
        return salesManager;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setSalary(double salary) {
        salary = 35000;
        this.salary = salary;
    }

    public void setSalesManager(SalesManager salesManager) {
        this.salesManager = salesManager;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
