import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    // 1. Четене

        int chickenMenuCount = Integer.parseInt(scanner.nextLine());
        int fishMenuCount = Integer.parseInt(scanner.nextLine());
        int vegetarianMenuCount = Integer.parseInt(scanner.nextLine());

       // 2. Изчисление

        double menuPriceTotal = (chickenMenuCount * 10.35) + (fishMenuCount * 12.40) + (vegetarianMenuCount * 8.15);
        double dessertPrice = menuPriceTotal * 0.20;
        double deliveryPrice = 2.50;
        double finalPriceOrder = menuPriceTotal + dessertPrice + deliveryPrice;

        // 3. Печатане
        System.out.println(finalPriceOrder);
    }

}
