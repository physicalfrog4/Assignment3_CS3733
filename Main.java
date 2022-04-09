//import java.util.HashMap;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Employee> empList1 = new ArrayList<Employee>();
        ArrayList<Employee> empList2 = new ArrayList<Employee>();
        ArrayList<Employee> empList3 = new ArrayList<Employee>();
        //associates customers
        ArrayList<Customer> empList4 = new ArrayList<>();
        ArrayList<Customer> empList5 = new ArrayList<>();
        ArrayList<Customer> empList6 = new ArrayList<>();
        ArrayList<Customer> empList7 = new ArrayList<>();
        //Sales Managers customers
        ArrayList<Customer> custList1 = new ArrayList<>();
        ArrayList<Customer> custList2 = new ArrayList<>();
        ArrayList<Customer> custList3 = new ArrayList<>();
        ArrayList<Customer> custList4 = new ArrayList<>();
        ArrayList<Customer> custList5 = new ArrayList<>();
        ArrayList<Customer> notCust = new ArrayList<>();
        Customer Jordan = new Customer(14, "Jordan");
        Customer Stephanie = new Customer(22, "Stephanie");
        Customer Gary = new Customer(76, "Gary");
        Customer Lisa = new Customer(43, "Lisa");
        Customer Damien = new Customer(97, "Damien");
        Customer Oliver = new Customer(35, "Oliver");


        SalesManager Serenity = new SalesManager(101, "Serenity", notCust, 75000, null, empList1);
        SalesManager Jose = new SalesManager(37, "Jose", notCust, 75000, Serenity, empList2);
        SalesAssociate David = new SalesAssociate(105, "David", custList1, 35000, Serenity, null);
        SalesAssociate Emily = new SalesAssociate(42, "Emily", custList2, 35000, Jose, null);
        SalesManager Amy = new SalesManager(112, "Amy", custList4, 75000, Serenity, empList3);
        //SalesAssociate
        SalesAssociate George = new SalesAssociate(58, "George", custList5, 35000, Amy, null);
        SalesAssociate Anne = new SalesAssociate(88, "Anne", custList3, 35000, Amy, null);
        //Serenity's list
        Serenity.addEmployees(Jose);
        Serenity.addEmployees(Amy);
        Serenity.addEmployees(David);
        Jose.addEmployees(Emily);
        Amy.addEmployees(Anne);
        Amy.addEmployees(George);
        David.addCustomer(Jordan);
        Emily.addCustomer(Stephanie);
        Emily.addCustomer(Gary);
        Anne.addCustomer(Lisa);
        Amy.addCustomer(Damien);
        George.addCustomer(Oliver);

        //Total Sales.
        /*
        System.out.println(Serenity.totalSales());
        System.out.println(Jose.totalSales());
        System.out.println(Amy.totalSales());
        System.out.println(David.totalSales());
        System.out.println(Emily.totalSales());
        System.out.println(George.totalSales());
        System.out.println(Anne.totalSales());

         */

        //Managers .toString()
        System.out.println(Serenity.toString());
        System.out.println(Jose.toString());
        System.out.println(Amy.toString());
        //Associates .toString()

        System.out.println(David.toString());
        System.out.println(Emily.toString());
        System.out.println(George.toString());
        System.out.println(Damien.toString());



    }
}
