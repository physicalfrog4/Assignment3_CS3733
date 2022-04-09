import java.util.ArrayList;

public abstract class Employee {
    public int employeeID;
    public String employeeName;
    public ArrayList<Customer> myCustomers;
    protected SalesManager manager;
    protected double salary;


    public Employee(int employeeID, String employeeName, ArrayList<Customer> myCustomers) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.myCustomers = myCustomers;
    }

    public void setManager(SalesManager salesManager){
        this.manager = salesManager;
        salesManager.addEmployees(this);
    }
    public void addCustomer(Customer customer){
       this.myCustomers.add(customer);
    }
    public ArrayList<Customer> getCustomers(){
        return myCustomers;
    }
    public abstract String toString();

    /* This was my old code, I'm trying to implement a personalized one.
    public static String toString(SalesManager salesManager){

        return "Sales Manager:" + salesManager.getEmployeeName() + "Manager: " + salesManager.getManager()
                + "Employees: " + salesManager.getEmployees() + "Total Salary: " + salesManager.totalSales();
    }

     */

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
