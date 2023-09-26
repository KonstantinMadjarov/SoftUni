import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        double totalDogFood = 0;
        double totalCatFood = 0;
        double totalEatenFood = 0;
        double biscuits = 0;

        for (int currentDay = 1; currentDay <= days; currentDay++) {

            double dogFood = Double.parseDouble(scanner.nextLine());
            double catFood = Double.parseDouble(scanner.nextLine());

            double totalFoodToday = dogFood + catFood;

            if (currentDay % 3 == 0){
                double biscuitsToday = totalFoodToday * 0.1;
                biscuits += biscuitsToday;
            }

            totalDogFood += dogFood;
            totalCatFood += catFood;
            totalEatenFood += totalFoodToday;
        }
        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", (totalEatenFood / totalFood) * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", (totalDogFood / totalEatenFood) * 100);
        System.out.printf("%.2f%% eaten from the cat.", (totalCatFood / totalEatenFood) * 100);

    }
}
