package Test.sales;

public class Discount extends Customer{
    public Discount(String id, int amount) {
        super(id, amount);
    }
    @Override
    public float backMoney() {
        return amount*off;
    }
}
