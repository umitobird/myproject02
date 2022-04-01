package Test.ticket;

public class StudentTicket extends Ticket{
    float off= 0.2f;
    public StudentTicket(Station startstation, Station destination) {
        super(startstation, destination);
        price = price-(int)(price*off);
//        (int)無條件捨去小數
    }
}
