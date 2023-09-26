import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myNumber = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = 1111; currentNumber <= 9999 ; currentNumber++) {

            boolean isSpecial = true;
            String textNumber = String.valueOf(currentNumber);

            for (int currentdigit = 0; currentdigit < textNumber.length(); currentdigit++) {
                int digit = Integer.parseInt(textNumber.charAt(currentdigit) + "");

                if (digit == 0) {
                    isSpecial = false;
                    break;
                }

                if (myNumber % digit != 0) {
                    isSpecial = false;
                    break;
                }
            }

            if (isSpecial) {
                System.out.print(currentNumber + " ");
            }

        }



    }
}
