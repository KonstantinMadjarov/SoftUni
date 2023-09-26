import java.util.Scanner;
public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double priceShip =0;

        switch (season) {
            case "Spring":
                priceShip = 3000.00;
                if (fishermen <= 6) {
                    priceShip = priceShip - (priceShip * 0.10);
                } else if (fishermen <= 11) {
                    priceShip = priceShip - (priceShip * 0.15);
                } else {
                    priceShip = priceShip - (priceShip * 0.25);
            }  if (fishermen % 2 == 0) {
                    priceShip = priceShip - (priceShip * 0.05);
            }
                break;
            case "Summer":
                priceShip = 4200.00;
                if (fishermen <= 6) {
                    priceShip = priceShip - (priceShip * 0.10);
                } else if (fishermen <= 11) {
                    priceShip = priceShip - (priceShip * 0.15);
                } else {
                priceShip = priceShip - (priceShip * 0.25);
            } if (fishermen % 2 == 0) {
                priceShip = priceShip - (priceShip * 0.05);
            }
                break;
            case "Autumn":
                priceShip = 4200.00;
                if (fishermen <= 6) {
                    priceShip = priceShip - (priceShip * 0.10);
                } else if (fishermen <= 11) {
                    priceShip = priceShip - (priceShip * 0.15);
                } else {
                priceShip = priceShip - (priceShip * 0.25);
            }
                break;
            case "Winter":
                priceShip = 2600.00;
                if (fishermen <= 6) {
                    priceShip = priceShip - (priceShip * 0.10);
                } else if (fishermen <= 11) {
                    priceShip = priceShip - (priceShip * 0.15);
                } else {
                priceShip = priceShip - (priceShip * 0.25);
            } if (fishermen % 2 == 0) {
                priceShip = priceShip - (priceShip * 0.05);
            }
                break;
        } if (priceShip <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - priceShip);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", priceShip - budget);
        }

    }
}
