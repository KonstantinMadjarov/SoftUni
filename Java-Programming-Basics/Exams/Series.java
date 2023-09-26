package June2019;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countSeries = Integer.parseInt(scanner.nextLine());

        int totalSeriesPrice = 0;


        for (int currentSeries = 1; currentSeries <= countSeries ; currentSeries++) {

            String seriesName = scanner.nextLine();
            double seriesPrice = Double.parseDouble(scanner.nextLine());


            switch (seriesName) {

                case "Thrones":
                    seriesPrice *= 0.5;
                    break;

                case "Lucifer":
                    seriesPrice *= 0.6;
                    break;

                    case "Protector":
                    seriesPrice *= 0.7;
                    break;

                case "TotalDrama":
                    seriesPrice *= 0.8;
                    break;

                case "Area":
                    seriesPrice *= 0.9;
                    break;
            }
            budget -= seriesPrice;

        }
        if (budget >= 0) {

            System.out.printf("You bought all the series and left with %.2f lv.", budget);

        } else {

            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget));

        }


    }
}
