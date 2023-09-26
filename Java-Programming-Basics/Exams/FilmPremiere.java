package June2019;

import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String moviePackage = scanner.nextLine();
        int ticketCount = Integer.parseInt(scanner.nextLine());

        double billPrice = 0.00;

        switch (movie) {
            case "John Wick":

                if(moviePackage.equals("Drink")) {
                    billPrice = ticketCount * 12;
                } else if(moviePackage.equals("Popcorn")) {
                    billPrice = ticketCount * 15;
                } else if(moviePackage.equals("Menu")) {
                    billPrice = ticketCount * 19;
                }
                break;

            case "Star Wars":

                if(moviePackage.equals("Drink")) {
                    billPrice = ticketCount * 18;
                } else if(moviePackage.equals("Popcorn")) {
                    billPrice = ticketCount * 25;
                } else if(moviePackage.equals("Menu")) {
                    billPrice = ticketCount * 30;
                }

                if(ticketCount >= 4) {
                    billPrice = billPrice - (billPrice * 0.3);
                }
                break;

            case "Jumanji":

                if(moviePackage.equals("Drink")) {
                    billPrice = ticketCount * 9;
                } else if(moviePackage.equals("Popcorn")) {
                    billPrice = ticketCount * 11;
                } else if(moviePackage.equals("Menu")) {
                    billPrice = ticketCount * 14;
                }

                if(ticketCount == 2) {
                    billPrice = billPrice - (billPrice * 0.15);
                }
                break;
        }

        System.out.printf("Your bill is %.2f leva.", billPrice);

    }
}
