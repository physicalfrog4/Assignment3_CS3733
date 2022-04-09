import java.util.ArrayList;

public abstract class Employee {
    public int employeeID;
    public String employeeName;
    public ArrayList<Customer> myCustomers = new ArrayList<Customer>();
    protected SalesManager manager;
    protected double salary;


    public Employee(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    //    this.myCustomers = myCustomers;
    }

    public void setManager(SalesManager salesManager){
        this.manager = salesManager;
        salesManager.addEmployees(this);
    }
    public void addCustomer(Customer customer){
       this.myCustomers.add(customer);
       customer.setEmployee(this);
    }
    public ArrayList<Customer> getCustomers(){
        return myCustomers;
    }
    public abstract String toString();

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    private void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    private void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

}
