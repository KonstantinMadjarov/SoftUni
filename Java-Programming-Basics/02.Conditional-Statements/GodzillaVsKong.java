import java.util.Scanner;

public class GodzillaVsKong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double costumesPrice = statists * priceClothes;

        if (statists > 150) {
            costumesPrice = costumesPrice - (costumesPrice * 0.1);
        }

        double moviePrice = decor + costumesPrice;

        if (moviePrice > budget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", moviePrice - budget);
        } else  {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget - moviePrice);
        }

    }
}
