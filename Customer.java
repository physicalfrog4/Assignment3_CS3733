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

    public String toString() {
        return "";
    }



}
