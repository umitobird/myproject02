package Test;

public class Customer {
    String id;
    int amount;
    float off = 0.1f;
    public Customer(String id, int amount){
        this.id = id;
        this.amount = amount;
    }
    public void print(){
        float offmoney = amount-(amount/1000)*off*1000;
        System.out.println(id+"\t"+amount+"\t"+offmoney);
    }
}
