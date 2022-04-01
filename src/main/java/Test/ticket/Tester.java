package Test.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your startstation? 1)Taipei 2)Taichung 3)Kouhsiung");
        int choice1 = Integer.parseInt(scanner.next());
        Station startstation = null;
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
        System.out.println("Your destination? 1)Taipei 2)Taichung 3)Kouhsiung");
        int choice2 = Integer.parseInt(scanner.next());
        Station destination = null;
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
        System.out.println("Which kind of your ticket? 1)Normal 2)Student 3)");
        int choice3 = Integer.parseInt(scanner.next());
        Ticket ticket = null;
        switch(choice3){
            case 1:
                ticket = new Ticket(startstation, destination);
                break;
            case 2:
                ticket = new StudentTicket(startstation, destination);
                break;
            case 3:
                ticket = new SeniorTicket(startstation, destination);
                break;
        }
//        System.out.println("How many? 1)1 2)2 3)3");
//        int choice4 = Integer.parseInt(scanner.next());
        ticket.print();
    }
}
