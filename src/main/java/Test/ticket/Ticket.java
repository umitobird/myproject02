package Test.ticket;

public class Ticket {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;
    int price;
    Station startstation;
    Station destination;
    public Ticket(Station startstation, Station destination){
        this.startstation = startstation;
        this.destination = destination;
    }
    public int getPrice() {
        if (startstation == Station.TAIPEI_STATION ||
                destination == Station.TAICHUNG_STATION){
            this.price = 600;
        }
        return price;
    }
    public void print(){
        System.out.println("起始站：" + startstation.id + "\t" + startstation.name
                + "\n" + "終點站：" + destination.id + "\t" + destination.name
                + "\n" + "價格："+ getPrice());
    }
}
