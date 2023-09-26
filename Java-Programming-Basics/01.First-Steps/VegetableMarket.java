import java.util.Scanner;

public class VegetableMarket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerKgVegs = Double.parseDouble(scanner.nextLine());
        double pricePerKgFruits = Double.parseDouble(scanner.nextLine());
        int totalKgVegs = Integer.parseInt(scanner.nextLine());
        int totalKgFruits = Integer.parseInt(scanner.nextLine());


        double incomeInBGN = (pricePerKgVegs * totalKgVegs) + (pricePerKgFruits * totalKgFruits);
        double incomeInEUR = incomeInBGN / 1.94;

        System.out.printf("%.2f", incomeInEUR);


    }
}
