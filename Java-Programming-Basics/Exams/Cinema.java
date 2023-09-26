package June2019;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int roomCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double income = 0.0;
        while (!"Movie time!".equals(input)) {
            int numberOfPeople = Integer.parseInt(input);
            roomCapacity -= numberOfPeople;
            if (roomCapacity < 0) {
                System.out.println("The cinema is full.");
                break;
            }

            double priceForTickets = numberOfPeople * 5;
            if (numberOfPeople % 3 == 0) {
                priceForTickets -= 5;
            }
            income += priceForTickets;

            input = scanner.nextLine();
            if ("Movie time!".equals(input)) {
                System.out.printf("There are %d seats left in the cinema.%n", roomCapacity);
            }
        }
        System.out.printf("Cinema income - %.0f lv.", income);

    }
}
