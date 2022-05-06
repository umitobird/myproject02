package Test.ticket;

public class StudentTicket extends Ticket{
    float off= 0.1f;
    public StudentTicket(Station start, Station destination) {
        super(start, destination);
        price = price - (int)(price*off);
//        (int)無條件捨去小數
    }
}
