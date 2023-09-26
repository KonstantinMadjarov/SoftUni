import java.util.Scanner;

public class LunchBreak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfSeries = scanner.nextLine();
        int lengthOfEpisode = Integer.parseInt(scanner.nextLine());
        double lunchBreak = Double.parseDouble(scanner.nextLine());

        double lunchTime = lunchBreak / 8.00;
        double restTime = lunchBreak / 4.00;

        lunchBreak = lunchBreak - (lunchTime + restTime);

        if (lunchBreak >= lengthOfEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameOfSeries, Math.ceil(lunchBreak - lengthOfEpisode));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameOfSeries, Math.ceil(lengthOfEpisode - lunchBreak));
        }

    }
}
