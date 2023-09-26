import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int percentFat = Integer.parseInt(scanner.nextLine());
        int percentProtein = Integer.parseInt(scanner.nextLine());
        int percentCarb = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());
        double water = Double.parseDouble(scanner.nextLine());

        double gramFat = (percentFat * 0.01 * calories) / 9;
        double gramProtein = (percentProtein * 0.01 * calories) / 4;
        double gramCarb = (percentCarb * 0.01 * calories) / 4;

        double weight = gramCarb + gramProtein + gramFat;
        double weightPerGram = calories / weight;
        double waterPerCarb = (100 - water) * 0.01;
        double result = waterPerCarb * weightPerGram;

        System.out.printf("%.4f", result);


    }
}
