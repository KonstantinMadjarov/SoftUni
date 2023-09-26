package June2019;

import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shootingTime = Integer.parseInt(scanner.nextLine());
        int countShots = Integer.parseInt(scanner.nextLine());
        int durationShot = Integer.parseInt(scanner.nextLine());

        double preparation = shootingTime * 0.15;

        double neededTime = countShots * durationShot + preparation;

        if(neededTime <= shootingTime) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", shootingTime - neededTime);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", neededTime - shootingTime);
        }

    }
}
