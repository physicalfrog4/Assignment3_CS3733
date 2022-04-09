import java.util.ArrayList;

public abstract class Employee {
    private int employeeID;
    private String employeeName;
    ArrayList<Customer> myCustomers;

    public void setManager(SalesManager salesManager){
        salesManager.addEmployees(salesManager);
    }
    public void addCustomer(Customer customer){
        myCustomers.add(customer);
    }
    public ArrayList<Customer> getCustomers(ArrayList<Customer> customers){
        return null;
    }

    public String toString(){
        return "";
    }

    private int getEmployeeID() {
        return employeeID;
    }

    private String getEmployeeName() {
        return employeeName;
    }

    private void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    private void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
