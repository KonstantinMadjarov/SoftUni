package Basics_Exercise;

import java.util.Scanner;

public class Login_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int position = username.length() - 1; position >= 0 ; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }

        int counterWrongPassword = 0;
        String enteredPassword = scanner.nextLine();
        while (!enteredPassword.equals(password)){

            counterWrongPassword++;

            if (counterWrongPassword == 4) {
                System.out.printf("User %s blocked!", username);
                return;
            }

            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

            System.out.printf("User %s logged in.\n", username);
    }
}
