package Test.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.TAIPEI_STATION, Station.KAOHSIUNG_STATION);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station? 1)Taipei 2)Taichung 3)Kouhsiung");
        Station startstation = null;
        int choice = Integer.parseInt(Scanner.next());
        switch(choice){
            case 1:
                startstation = Station.TAIPEI_STATION;
            case 2:
                startstation = Station.TAICHUNG_STATION;
            case 3:
                startstation = Station.KAOHSIUNG_STATION;
        }
    }
}
