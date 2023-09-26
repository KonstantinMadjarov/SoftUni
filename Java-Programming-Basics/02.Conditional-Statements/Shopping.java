import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int proccessors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        //•	Видеокарта – 250 лв./бр.
        //•	Процесор – 35% от цената на закупените видеокарти/бр.
        //•	Рам памет – 10% от цената на закупените видеокарти/бр.

        double videoCardPrice = videoCards * 250;
        double proccessorPrice = (videoCardPrice * 0.35) * proccessors;
        double ramMemoryPrice = (videoCardPrice * 0.10) * ramMemory;

        double totalCostMaterials = videoCardPrice + proccessorPrice + ramMemoryPrice;

        if(videoCards > proccessors) {
            totalCostMaterials = totalCostMaterials - (totalCostMaterials * 0.15);
        }

        if (budget >= totalCostMaterials) {
            System.out.printf("You have %.2f leva left!", budget - totalCostMaterials);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - totalCostMaterials));
        }

    }
}
