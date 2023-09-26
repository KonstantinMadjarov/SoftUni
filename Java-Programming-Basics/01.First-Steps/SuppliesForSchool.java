import java.util.Scanner;

public class SuppliesForSchool {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // •	Брой пакети химикали - цяло число в интервала [0...100]
        //•	Брой пакети маркери - цяло число в интервала [0...100]
        //•	Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        //•	Процент намаление - цяло число в интервала [0...100]

        int pencils = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaner = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double materialPrice = (pencils * 5.80) + (markers * 7.20) + (cleaner * 1.20);
        double discount = materialPrice * (percentDiscount / 100.0);

        System.out.println(materialPrice - discount);

    }
}
