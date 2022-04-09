import java.util.ArrayList;

public class SalesManager {
    double salary;
    SalesManager manager;
    ArrayList<Employee> employees;
    public SalesManager(double salary, SalesManager manager, ArrayList<Employee> employees){
        this.salary = salary;
        this.manager = manager;
        this.employees = employees;
    }
    public void addEmployees(Employee employee){

    }
    public ArrayList<Employee> getEmployees(){
        return employees;
    }
    public double totalSales(){
        return 0;
    }
}
