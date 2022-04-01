package Test.sales;

public class PlatiumCustomer extends SilverCustomer{
    public PlatiumCustomer(String id, int amount) {
        super(id, amount);
        off = 0.3f;
    }
    public float backMoney2() {
        return amount*0.2f;
    }
    @Override
    public void print() {
        System.out.println(
                id + "\t" + amount + "\t" + (amount-backMoney()) +
                        "("+backMoney2()+")");
    }
}
