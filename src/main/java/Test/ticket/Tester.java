package Test.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station? 1)Taipei 2)Taichung 3)Kouhsiung");
        Station startstation = null;
        Station destination = null;
        int choice1 = Integer.parseInt(scanner.next());
        int choice2 = Integer.parseInt(scanner.next());
        switch(choice1){
            case 1:
                startstation = Station.TAIPEI_STATION;
                break;
            case 2:
                startstation = Station.TAICHUNG_STATION;
                break;
            case 3:
                startstation = Station.KAOHSIUNG_STATION;
                break;
        }
        switch(choice2){
            case 1:
                destination = Station.TAIPEI_STATION;
                break;
            case 2:
                destination = Station.TAICHUNG_STATION;
                break;
            case 3:
                destination = Station.KAOHSIUNG_STATION;
                break;
        }
        Ticket ticket = new Ticket(startstation, destination);
        ticket.print();
    }
}
