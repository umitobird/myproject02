package Test.ticket;

public class SeniorTicket extends Ticket{
    float off = 0.5f;
    public SeniorTicket(Station start, Station destination) {
        super(start, destination);
        price = price-(int)(price*off);
    }
}