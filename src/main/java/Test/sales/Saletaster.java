package Test.sales;

import java.util.ArrayList;
import java.util.List;

public class Saletaster {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("0001", 1200));
        customers.add(new Customer("0002", 800));
        customers.add(new SilverCustomer("0003", 2000));
        customers.add(new GoldenCustomer("0004", 4000));
        customers.add(new PlatiumCustomer("0007", 1000));
//        for (int i = 0; i < 5; i++) {
//            customers.get(i).print();
//        }
        for (Customer c : customers){
            c.print();
        }
//        Customer c1 = new Customer("0001", 1200);
//        Customer c2 = new Customer("0002", 800);
//        SilverCustomer c3 = new SilverCustomer("0003", 2000);
//        GoldenCustomer c4 = new GoldenCustomer("0004", 4000);
//        Discount c5 = new Discount("0006", 900);
//        PlatiumCustomer c6 = new PlatiumCustomer("0007", 1000);
//        c1.print();
//        c2.print();
//        c3.print();
//        c4.print();
//        c5.print();
//        c6.print();
    }
}
