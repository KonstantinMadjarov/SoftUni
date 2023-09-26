package Basics_Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int personCount = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0.00;

        switch (day) {
            case "Friday":
                if (typeOfGroup.equals("Students")){
                    price = personCount * 8.45;
                } else if (typeOfGroup.equals("Business")){
                    price = personCount * 10.90;
                } else if (typeOfGroup.equals("Regular")) {
                    price = personCount * 15.00;
                }
                break;
            case "Saturday":
                if (typeOfGroup.equals("Students")){
                    price = personCount * 9.80;
                } else if (typeOfGroup.equals("Business")){
                    price = personCount * 15.60;
                } else if (typeOfGroup.equals("Regular")) {
                    price = personCount * 20.00;
                }
                break;
            case "Sunday":
                if (typeOfGroup.equals("Students")){
                    price = personCount * 10.46;
                } else if (typeOfGroup.equals("Business")){
                    price = personCount * 16.00;
                } else if (typeOfGroup.equals("Regular")) {
                    price = personCount * 22.50;
                }
                break;
        }

        if (typeOfGroup.equals("Students") && personCount >= 30) {
            price = price * 0.85;
        } else if (typeOfGroup.equals("Business") && personCount >= 100) {
            personCount -= 10;

        } else if (typeOfGroup.equals("Regular") && personCount >= 10 && personCount <= 20) {
            price = price * 0.95;
        }
        System.out.printf("Total price: %.2f", price);
    }
}
