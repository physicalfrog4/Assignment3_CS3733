import java.util.ArrayList;

public class SalesManager extends Employee{
    double salary;
    SalesManager manager;
    ArrayList<Employee> employees;
    public SalesManager(double salary, SalesManager manager, ArrayList<Employee> employees){
        this.salary = salary;
        this.manager = manager;
        this.employees = employees;
    }
    public void addEmployees(Employee employee){
        employees.add(employee);
    }
    public ArrayList<Employee> getEmployees(){
        return employees;
    }
    public double totalSales(){
        return 0;
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
