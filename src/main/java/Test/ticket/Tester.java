package Test.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Station startstation = null;
        Station destination = null;
        System.out.println("Your startstation? 1)Taipei 2)Taichung 3)Kouhsiung");
        int choice1 = Integer.parseInt(scanner.next());
        System.out.println("Your destination? 1)Taipei 2)Taichung 3)Kouhsiung");
        int choice2 = Integer.parseInt(scanner.next());
        System.out.println("Your ticket? 1)Adult 2)Concession");
        int choice3 = Integer.parseInt(scanner.next());
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
        switch(choice3){
            case 1:
                destination = Station.TAIPEI_STATION;
                break;
            case 2:
                destination = Station.TAICHUNG_STATION;
                break;
        }
        Ticket ticket = new Ticket(startstation, destination);
        ticket.print();
    }
}
