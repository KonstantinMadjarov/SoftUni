package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumDigits_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number ; i++) {

            int sum = 0;
            while(number > 0) {

                int lastDigit = number % 10;

                sum += lastDigit;

                number /= 10;
            }

            System.out.println(sum);
        }
    }
}
