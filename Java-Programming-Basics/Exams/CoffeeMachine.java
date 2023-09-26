import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int countDrinks = Integer.parseInt(scanner.nextLine());

        double price = 0;
        if (drink.equals("Espresso")) {
            if (sugar.equals("Without")) {
                price = 0.9;

            } else if (sugar.equals("Normal")) {
                price = 1.0;

            } else if (sugar.equals("Extra")) {
                price = 1.20;
            }
        }

        if (drink.equals("Cappuccino")) {
            if (sugar.equals("Without")) {
                price = 1.0;
            }
             else if (sugar.equals("Normal")) {
                price = 1.2;
            }
             else if (sugar.equals("Extra")) {
                price = 1.6;
            }
        }

        if (drink.equals("Tea")) {
            if (sugar.equals("Without")) {
                price = 0.5;
            }
            else if (sugar.equals("Normal")) {
                price = 0.6;
            }
             else if (sugar.equals("Extra")) {
                price = 0.7;
            }
        }

        double totalPrice = price * countDrinks;

        if (sugar.equals("Without")) {
            totalPrice = totalPrice * 0.65;
        }

        if (drink.equals("Espresso") && countDrinks >= 5) {
            totalPrice = totalPrice * 0.75;
        }

        if(totalPrice > 15) {
            totalPrice = totalPrice * 0.8;
        }


        System.out.printf("You bought %d cups of %s for %.2f lv.", countDrinks, drink, totalPrice);


    }
}
