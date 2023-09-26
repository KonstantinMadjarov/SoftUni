package May2019;

import java.util.Scanner;

public class Safari {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double litresFuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double tripGuy = 100.00;

        double totalCost = litresFuel * 2.10 + tripGuy;

        if (day.equals("Saturday")) {
            totalCost *= 0.9;
        } else if(day.equals("Sunday")) {
            totalCost *= 0.8;
        }


        if (budget >= totalCost) {
            System.out.printf("Safari time! Money left: %.2f lv.%n", budget - totalCost);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.%n", totalCost - budget);
        }

    }
}
