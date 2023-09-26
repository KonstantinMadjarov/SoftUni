import java.util.Scanner;
public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double transport = 0.00;
        double ticketPrice = 0.00;

        switch (category) {
            case "VIP":
                ticketPrice = 499.99;
                break;
            case "Normal":
                ticketPrice = 249.99;
                break;
        }

        if (people >= 1 && people <= 4) {
            transport = budget * 0.75;
            budget = budget - transport;
            ticketPrice = people * ticketPrice;
        } else if (people >= 5 && people <= 9) {
            transport = budget * 0.60;
            budget = budget - transport;
            ticketPrice = people * ticketPrice;
        } else if (people >= 10 && people <= 24) {
            transport = budget * 0.50;
            budget = budget - transport;
            ticketPrice = people * ticketPrice;
        } else if (people >= 25 && people <= 49) {
            transport = budget * 0.40;
            budget = budget - transport;
            ticketPrice = people * ticketPrice;
        } else {
            transport = budget * 0.25;
            budget = budget - transport;
            ticketPrice = people * ticketPrice;
        }


       if (budget > ticketPrice) {
           System.out.printf("Yes! You have %.2f leva left.", budget - ticketPrice);
       } else {
           System.out.printf("Not enough money! You need %.2f leva.", ticketPrice - budget);
       }

    }
}
