import java.util.Scanner;
public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());
        double pricePerNightStudio = 0.00;
        double pricePerNightApartment = 0.00;
        double totalPriceForStayStudio = 0.00;
        double totalPriceForStayApartment = 0.00;

        switch (month) {
            case "May":
            case "October":
                pricePerNightStudio = 50.00;
                pricePerNightApartment = 65.00;
                if (nightsCount > 7 && nightsCount <= 14) {
                    pricePerNightStudio -= pricePerNightStudio * 0.05;
                } else if (nightsCount > 14) {
                    pricePerNightStudio -= pricePerNightStudio * 0.3;
                    pricePerNightApartment -= pricePerNightApartment * 0.1;
                } break;
            case "June":
            case "September":
                pricePerNightStudio = 75.20;
                pricePerNightApartment = 68.70;
                if (nightsCount > 14) {
                    pricePerNightStudio -= pricePerNightStudio * 0.2;
                    pricePerNightApartment -= pricePerNightApartment * 0.1;
                } break;
            case "July":
            case "August":
                pricePerNightStudio = 76.00;
                pricePerNightApartment = 77.00;
                if (nightsCount > 14) {
                    pricePerNightApartment -= pricePerNightApartment * 0.1;
                }
        }
        totalPriceForStayApartment = nightsCount * pricePerNightApartment;
        totalPriceForStayStudio = nightsCount * pricePerNightStudio;
        System.out.printf("Apartment: %.2f lv.%n" , totalPriceForStayApartment);
        System.out.printf("Studio: %.2f lv." , totalPriceForStayStudio);
    }
}
