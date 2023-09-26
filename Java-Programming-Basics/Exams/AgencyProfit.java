import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int adultCount = Integer.parseInt(scanner.nextLine());
        int kidCount = Integer.parseInt(scanner.nextLine());
        double adultPrice = Double.parseDouble(scanner.nextLine());
        double taxService = Double.parseDouble(scanner.nextLine());

        double kidsPrice = adultPrice * 0.3;
        double adultTotal = adultPrice + taxService;
        double kidTotal = kidsPrice + taxService;
        double finalTicketPrice = (adultTotal * adultCount) + (kidTotal * kidCount);

        double agencyProfit = finalTicketPrice * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, agencyProfit);


    }
}
