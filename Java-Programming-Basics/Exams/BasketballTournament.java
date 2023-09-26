import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalGamesCount = 0;
        int winGamesCount = 0;
        int lostGamesCount = 0;
        String input = scanner.nextLine();
        while (!input.equals("End of tournaments")) {
            String tournamentName = input;
            int gamesCount = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= gamesCount ; i++) {
                totalGamesCount++;

                int pointsDesi = Integer.parseInt(scanner.nextLine());
                int pointsOpponent = Integer.parseInt(scanner.nextLine());

                int diff = Math.abs(pointsDesi - pointsOpponent);


                if (pointsDesi > pointsOpponent) {
                    winGamesCount++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tournamentName, diff);
                } else {
                    lostGamesCount++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tournamentName, diff);
                }

            }

            input = scanner.nextLine();
        }

        double winPercentage = winGamesCount * 1.0 / totalGamesCount * 100;
        double lostPercentage = lostGamesCount * 1.0 / totalGamesCount * 100;

        System.out.printf("%.2f%% matches win%n", winPercentage);
        System.out.printf("%.2f%% matches lost%n", lostPercentage);


    }
}
