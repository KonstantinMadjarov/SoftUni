import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruitType = scanner.nextLine();
        String setSize = scanner.nextLine();
        int countSets = Integer.parseInt(scanner.nextLine());

        double packagePrice = 0.00;
        double finalSetPrice = 0.00;

        if (setSize.equals("small")) {
            switch (fruitType) {
                case "Watermelon":
                    packagePrice = 56.00 * 2;
                    finalSetPrice = packagePrice * countSets;
                    break;
                case "Mango":
                    packagePrice = 36.66 * 2;
                    finalSetPrice = packagePrice * countSets;
                    break;
                case "Pineapple":
                    packagePrice = 42.10 * 2;
                    finalSetPrice = packagePrice * countSets;
                    break;
                case "Raspberry":
                    packagePrice = 20.00 * 2;
                    finalSetPrice = packagePrice * countSets;
                    break;
            }

        } else if (setSize.equals("big")) {
            switch (fruitType) {
                case "Watermelon":
                    packagePrice = 28.70 * 5;
                    finalSetPrice = packagePrice * countSets;
                    break;
                case "Mango":
                    packagePrice = 19.60 * 5;
                    finalSetPrice = packagePrice * countSets;
                    break;
                case "Pineapple":
                    packagePrice = 24.80 * 5;
                    finalSetPrice = packagePrice * countSets;
                    break;
                case "Raspberry":
                    packagePrice = 15.20 * 5;
                    finalSetPrice = packagePrice * countSets;
                    break;
            }

        }

        if (finalSetPrice >= 400 && finalSetPrice <= 1000) {
            finalSetPrice = finalSetPrice - (finalSetPrice * 0.15);
        } else if (finalSetPrice > 1000) {
            finalSetPrice = finalSetPrice - (finalSetPrice * 0.50);
        }

        System.out.printf("%.2f lv.", finalSetPrice);

    }
}
