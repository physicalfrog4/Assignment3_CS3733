import java.util.ArrayList;

public class SalesAssociate extends Employee {
    double salary;
    SalesManager salesManager;

    public SalesAssociate(int employeeID, String employeeName, double salary, SalesManager salesManager) {
        super(employeeID, employeeName);
        this.salary = salary;
        this.salesManager = salesManager;

    }

    public double getSalary() {
        return salary;
    }

    public SalesManager getSalesManager() {
        return salesManager;
    }

    public void setSalary(double salary) {
        salary = 35000;
        this.salary = salary;
    }

    public void setSalesManager(SalesManager salesManager) {
        this.salesManager = salesManager;
    }


    public double totalSales() {
        return (100 * myCustomers.size());
    }

    @Override
    public String toString() {
        String employeeString = "null";
        String managerName;
        if (this.manager == null) {
            managerName = "null";
        } else {
            managerName = this.manager.getEmployeeName();
        }
        return String.format(
                "Sales Associate: %s. Manager: %s. Employees: %s. Total Sales: %.0f",
                this.employeeName, managerName, employeeString, totalSales());
    }
}
