package Test;

public class Saletaster {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001", 1200);
        Customer c2 = new Customer("0002", 800);
        SilverCustomer c3 = new SilverCustomer("0003", 2000);
        GoldenCustomer c4 = new GoldenCustomer("0004", 4000);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
    }
}
