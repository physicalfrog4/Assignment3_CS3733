import java.util.ArrayList;

public class Customer {
    int customerID;
    String customerName;
    ArrayList<Employee> myEmployee = new ArrayList<>();

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public void setEmployee(Employee employee) {
        this.getMyEmployee().add(employee);
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
        System.out.print("Customer: " + customerName + ", Employee: ");
        int size = myEmployee.size();
        for (int i = 0; i < size; i++) {
            System.out.print(myEmployee.get(i).employeeName);
            if (i + 1 < size) {
                System.out.print(", ");
            }
        }
        System.out.println();
        return "";
    }


}
