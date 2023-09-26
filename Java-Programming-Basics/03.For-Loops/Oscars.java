import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double initialPoints = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());

        double totalPoints = 0;
        totalPoints += initialPoints;



        for (int i = 0; i < juryCount; i++) {

            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());

            //дължината на името на оценяващия умножено по точките, които дава делено на две.

            totalPoints += juryName.length() * juryPoints / 2;

            if (totalPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
                return;
            }

        }

        System.out.printf("Sorry, %s you need %.1f more!", actorName, (1250.5 - totalPoints));
    }
}
