package May2019;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        int productCounter = 0;
        double totalProductsPrice = 0;


        String input = scanner.nextLine();
        while(!input.equals("Stop")) {

            String product = input;
            double productPrice = Double.parseDouble(scanner.nextLine());
            productCounter++;

            if (productCounter % 3 == 0) {
                productPrice *= 0.5;
            }

            totalProductsPrice += productPrice;


            if (totalProductsPrice > budget) {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", totalProductsPrice - budget);
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Stop")) {
                System.out.printf("You bought %d products for %.2f leva.%n", productCounter, totalProductsPrice);
            }


    }
}
