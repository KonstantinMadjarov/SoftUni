package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int currentLitres = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            int pouredLitres = Integer.parseInt(scanner.nextLine());
            currentLitres += pouredLitres;
            if (currentLitres > capacity) {
                System.out.println("Insufficient capacity!");
                currentLitres -= pouredLitres;
            }
        }

        System.out.println(currentLitres);
    }
}
