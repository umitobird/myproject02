package Test;

public class SilverCustomer extends Customer {
    int A;
    public SilverCustomer(String id, int amount, int A){
        super(id, amount, A);
        this.A = A;
    }
    @Override
    public void print(){
        float offmoney = amount-(amount/1000)*off*1000;
        System.out.println(id+"\t"+amount+"\t"+offmoney);
    }
}
