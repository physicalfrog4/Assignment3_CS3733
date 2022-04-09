import java.util.ArrayList;

public abstract class Employee {
    public int employeeID;
    public String employeeName;
    public ArrayList<Customer> myCustomers;

    public Employee(int employeeID, String employeeName, ArrayList<Customer> myCustomers) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.myCustomers = myCustomers;
    }


    public void setManager(SalesManager salesManager){
        salesManager.addEmployees(salesManager);
    }
    public void addCustomer(Customer customer){
        myCustomers.add(customer);
    }
    public ArrayList<Customer> getCustomers(ArrayList<Customer> customers){
        return null;
    }

    public static String toString(SalesManager salesManager){
        return "Sales Manager:" + salesManager.getEmployeeName() + "Manager: " + salesManager.getManager()
                + "Employees: " + salesManager.getEmployees();
    }

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
