package Test;

public class Saletaster {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001", 1200);
        Customer c2 = new Customer("0002", 800);
        SilverCustomer c3 = new SilverCustomer("0003", 2000,1);
        c1.print();
        c2.print();
        c3.print();
    }
}
