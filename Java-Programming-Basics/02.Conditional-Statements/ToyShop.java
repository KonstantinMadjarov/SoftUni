import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // 1. Четем от входа:
        double trip = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

    // 2. Изчисления:

        double orderPrice = (puzzles * 2.60) + (dolls * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2);

        int totalToysCount = puzzles + dolls + bears + minions + trucks;

        if (totalToysCount >= 50) {
            orderPrice = orderPrice - (orderPrice * 0.25);
        }
        orderPrice = orderPrice - (orderPrice * 0.10);

        if(trip <= orderPrice) {
            System.out.printf("Yes! %.2f lv left.", orderPrice - trip);

        } else {
            System.out.printf("Not enough money! %.2f lv needed.", trip - orderPrice);
        }

    }
}
