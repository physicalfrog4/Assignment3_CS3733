import java.util.ArrayList;

public class SalesAssociate {
    double salary;
    SalesManager salesManager;
    ArrayList<Employee> employees;

    public SalesAssociate(double salary, SalesManager salesManager, ArrayList employees) {
        this.salary = salary;
        this.salesManager = salesManager;
        this.employees = employees;
    }
}
