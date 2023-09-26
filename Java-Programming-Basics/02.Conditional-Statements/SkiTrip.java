import java.util.Scanner;
public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String place = scanner.nextLine();
        String grade = scanner.nextLine();

        double finalPrice = 0.00;
        int nights = days - 1;

        switch (place) {
            case "room for one person":
                finalPrice = nights * 18.00;
                break;
            case "apartment":
                finalPrice = nights * 25.00;
                if (days < 10) {
                    finalPrice = finalPrice - (finalPrice * 0.30);
                } else if (days <= 15) {
                    finalPrice = finalPrice - (finalPrice * 0.35);
                } else {
                    finalPrice = finalPrice - (finalPrice * 0.50);
                }
                break;
            case "president apartment":
                finalPrice = nights * 35.00;
                if (days < 10) {
                    finalPrice = finalPrice - (finalPrice * 0.10);
                } else if (days <= 15) {
                    finalPrice = finalPrice - (finalPrice * 0.15);
                } else {
                    finalPrice = finalPrice - (finalPrice * 0.20);
                }
                break;
        }
            if (grade.equals("positive")) {
                finalPrice = finalPrice + (finalPrice * 0.25);
        }   else if (grade.equals("negative")) {
                finalPrice = finalPrice - (finalPrice * 0.10);
            }
        System.out.printf("%.2f", finalPrice);
    }
}
