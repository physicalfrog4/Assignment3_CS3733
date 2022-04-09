//import java.util.HashMap;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Employee> empList1 = new ArrayList<Employee>();
        ArrayList<Employee> empList2 = new ArrayList<Employee>();
        ArrayList<Employee> empList3 = new ArrayList<Employee>();
        ArrayList<Customer> empList4 = new ArrayList<>();
        ArrayList<Customer> empList5 = new ArrayList<>();
        ArrayList<Customer> empList6 = new ArrayList<>();
        ArrayList<Customer> empList7 = new ArrayList<>();
//SalesManagers
        SalesManager Serenity = new SalesManager(75000, null, empList1);
        SalesManager Jose = new SalesManager(75000, Serenity, empList2);
        SalesManager Amy = new SalesManager(75000, Serenity, empList3);
        //SalesAssociate
        SalesAssociate David = new SalesAssociate(105,"David", empList4,35000, Serenity, null);
        SalesAssociate Emily = new SalesAssociate(42,"Emily",empList5,35000, Jose, null);
        SalesAssociate George = new SalesAssociate(58,"George",empList6,35000, Amy, null);
        SalesAssociate Anne = new SalesAssociate(88,"Anne",empList7,35000, Amy, null);
        //Serenity's list
        empList1.add(Jose);
        empList1.add(Amy);
        empList1.add(David);
        //Jose's list
        empList2.add(Emily);
        //amy's List
        empList3.add(Anne);
        empList3.add(George);
        //customers
        Customer Jordan = new Customer(14, "Jordan");
        Customer Stephanie = new Customer(22, "Stephanie");
        Customer Gary = new Customer(76, "Gary");
        Customer Lisa = new Customer(43, "Lisa");
        Customer Damien = new Customer(97, "Damien");
        Customer Oliver = new Customer(35, "Oliver");
        Employee.toString(Serenity);

    }
}
