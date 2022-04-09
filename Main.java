import java.util.ArrayList;
import java.util.zip.GZIPOutputStream;

public class Main {
    public static void main(String args[]) {

        Customer Jordan = new Customer(14, "Jordan");
        Customer Stephanie = new Customer(22, "Stephanie");
        Customer Gary = new Customer(76, "Gary");
        Customer Lisa = new Customer(43, "Lisa");
        Customer Damien = new Customer(97, "Damien");
        Customer Oliver = new Customer(35, "Oliver");

        //SalesManager
        SalesManager Serenity = new SalesManager(101, "Serenity", 75000, null);
        SalesManager Jose = new SalesManager(37, "Jose", 75000, Serenity);
        SalesManager Amy = new SalesManager(112, "Amy", 75000, Serenity);
        //SalesAssociate
        SalesAssociate David = new SalesAssociate(105, "David", 35000, Serenity);
        SalesAssociate Emily = new SalesAssociate(42, "Emily", 35000, Jose);
        SalesAssociate George = new SalesAssociate(58, "George", 35000, Amy);
        SalesAssociate Anne = new SalesAssociate(88, "Anne", 35000, Amy);
        //Serenity's list
        Serenity.addEmployees(Jose);
        Serenity.addEmployees(Amy);
        Serenity.addEmployees(David);
        //Joe's list
        Jose.addEmployees(Emily);
        Jose.setManager(Serenity);
        //Amy's list
        Amy.addEmployees(Anne);
        Amy.addEmployees(George);
        //David's list
        David.addCustomer(Jordan);
        David.setManager(Serenity);
        //Emily's list
        Emily.addCustomer(Stephanie);
        Emily.addCustomer(Gary);
        Emily.setManager(Jose);
        //Anne's list
        Anne.addCustomer(Lisa);
        Anne.setManager(Amy);
        //Amy's list
        Amy.addCustomer(Damien);
        Amy.setManager(Serenity);
        //George's list
        George.addCustomer(Oliver);
        George.setManager(Amy);

        //Managers .toString()
        System.out.println(Serenity.toString());
        System.out.println(Jose.toString());
        System.out.println(Amy.toString());
        //Associates .toString()
        System.out.println(David.toString());
        System.out.println(Emily.toString());
        System.out.println(George.toString());
        System.out.println(Damien.toString());
        //Customers .toString()
        System.out.println(Jordan.toString());
        System.out.println(Stephanie.toString());
        System.out.println(Gary.toString());
        System.out.println(Lisa.toString());
        System.out.println(Damien.toString());
        System.out.println(Oliver.toString());

    }
}
