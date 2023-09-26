package May2019;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;


        for (int currentday = 1; currentday <= days ; currentday++) {

            double dayPrice = 0;


            for (int currenthour = 1; currenthour <= hours ; currenthour++) {

                if ((currentday % 2 == 0) && (currenthour % 2 != 0)) {
                    dayPrice += 2.50;

                } else if (currentday % 2 != 0 && currenthour % 2 == 0) {
                    dayPrice += 1.25;

                } else {
                    dayPrice += 1.00;
                }

            }

            totalPrice += dayPrice;
            System.out.printf ("Day: %d - %.2f leva%n", currentday, dayPrice);
        }

        System.out.printf("Total: %.2f leva", totalPrice);
    }
}
