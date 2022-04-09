import java.util.ArrayList;

public class Customer {
    int customerID;
    String customerName;
    ArrayList<Employee> myEmployee;

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
    }

    private void setEmployee(Employee employee) {
        myEmployee.add(employee);
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setMyEmployee(ArrayList<Employee> myEmployee) {
        this.myEmployee = myEmployee;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Employee> getMyEmployee() {
        return myEmployee;
    }

    public String toString() {
        return "";
    }



}
