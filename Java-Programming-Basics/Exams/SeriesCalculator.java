package June2019;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int countSeasons = Integer.parseInt(scanner.nextLine());
        int countEpisodes = Integer.parseInt(scanner.nextLine());
        double episodeTimeNoAds = Double.parseDouble(scanner.nextLine());

        double adsTime = episodeTimeNoAds * 0.2;
        double finalEpisodeTime = episodeTimeNoAds + adsTime;
        int additionalFinalEpisode = countSeasons * 10;

        double totalMinutesNeeded = finalEpisodeTime * countEpisodes * countSeasons + additionalFinalEpisode;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", seriesName, totalMinutesNeeded);


    }
}
