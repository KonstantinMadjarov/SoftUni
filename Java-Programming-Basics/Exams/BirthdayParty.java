import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rentHall = Double.parseDouble(scanner.nextLine());

        //•	Торта  – цената ѝ е 20% от наема на залата
        //•	Напитки – цената им е 45% по-малко от тази на тортата
        //•	Аниматор – цената му е 1/3 от цената за наема на залата

        double cakePrice = rentHall * 0.20;

        double drinkPrice = cakePrice - (cakePrice * 0.45);

        double animatorPrice = rentHall / 3.00;

        double totalBudget = rentHall + cakePrice + drinkPrice + animatorPrice;

        System.out.printf("%.1f", totalBudget);

    }
}
