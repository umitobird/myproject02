package Test.sales;

public class GoldenCustomer extends SilverCustomer {

    public GoldenCustomer(String id, int amount) {
        super(id, amount);
        float off = 0.2f;
    }
}