package Test.ticket;

public class SeniorTicket extends Ticket{
    float off = 0.5f;
    public SeniorTicket(Station startstation, Station destination) {
        super(startstation, destination);
        price = price-(int)(price*off);
    }
}