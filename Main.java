//import java.util.HashMap;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        Customer Jordan = new Customer(14, "Jordan");
        Customer Stephanie = new Customer(22, "Stephanie");
        Customer Gary = new Customer(76, "Gary");
        Customer Lisa = new Customer(43, "Lisa");
        Customer Damien = new Customer(97, "Damien");
        Customer Oliver = new Customer(35, "Oliver");


        SalesManager Serenity = new SalesManager(101, "Serenity", 75000, null);
        SalesManager Jose = new SalesManager(37, "Jose", 75000, Serenity);
        SalesAssociate David = new SalesAssociate(105, "David", 35000, Serenity);
        SalesAssociate Emily = new SalesAssociate(42, "Emily", 35000, Jose);
        SalesManager Amy = new SalesManager(112, "Amy", 75000, Serenity);
        //SalesAssociate
        SalesAssociate George = new SalesAssociate(58, "George", 35000, Amy);
        SalesAssociate Anne = new SalesAssociate(88, "Anne", 35000, Amy);
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


        //Managers .toString()
        System.out.println(Serenity.toString());
        System.out.println(Jose.toString());
        System.out.println(Amy.toString());
        //Associates .toString()

        System.out.println(David.toString());
        System.out.println(Emily.toString());
        System.out.println(George.toString());
        System.out.println(Damien.toString());




        Stephanie.toString();
        Damien.toString();
    }
}
