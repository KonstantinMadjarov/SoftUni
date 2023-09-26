import java.util.Scanner;
public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String track = scanner.nextLine();

        double fee = 0.00;
        double finalSum = 0.00;

        switch (track) {
            case "trail":
                fee = (juniors * 5.50) + (seniors * 7.00);
                break;
            case "cross-country":
                fee = (juniors * 8.00) + (seniors * 9.50);
                if ((juniors + seniors) >= 50) {
                    fee = fee - (fee * 0.25);
                }
                break;
            case "downhill":
                fee = (juniors * 12.25) + (seniors * 13.75);
                break;
            case "road":
                fee = (juniors * 20.00) + (seniors * 21.50);
                break;
        }
            finalSum = fee - (fee * 0.05);

        System.out.printf("%.2f", finalSum);

    }
}
