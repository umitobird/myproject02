package Test.ticket;

public class SeniorTicket extends StudentTicket{
    public SeniorTicket(Station startstation, Station destination) {
        super(startstation, destination);
        float off = 0.5f;
    }
}