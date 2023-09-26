import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalFoodInKg = Integer.parseInt(scanner.nextLine());

        int totalFoodInGrams = totalFoodInKg * 1000;

        int totalEatenFood = 0;


        String input = scanner.nextLine();
        while (!input.equals("Adopted") ) {

            int gramsPerDay = Integer.parseInt(input);
            totalEatenFood += gramsPerDay;
            input = scanner.nextLine();

        }

        if (totalEatenFood <= totalFoodInGrams) {
            System.out.printf("Food is enough! Leftovers: %d grams.", totalFoodInGrams - totalEatenFood);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", totalEatenFood - totalFoodInGrams);
        }
    }
}
