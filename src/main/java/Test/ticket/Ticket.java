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
        if (startstation == Station.TAIPEI_STATION){
            if (destination == Station.TAICHUNG_STATION)
                this.price = 600;
            if (destination == Station.KAOHSIUNG_STATION)
                this.price = 1500;
        }
        if (startstation == Station.TAICHUNG_STATION){
            if (destination == Station.KAOHSIUNG_STATION)
                this.price = 900;
            if (destination == Station.TAIPEI_STATION)
                this.price = 600;
        }
        if (startstation == Station.KAOHSIUNG_STATION){
            if (destination == Station.TAIPEI_STATION)
                this.price = 1500;
            if (destination == Station.TAICHUNG_STATION)
                this.price = 900;
        }
    }
    public void print(){
        System.out.println("Startstation:" + startstation.id + "\t" + startstation.name
                + "\n" + "Destination:" + destination.id + "\t" + destination.name
                + "\n" + "Price："+ price);
    }
}
