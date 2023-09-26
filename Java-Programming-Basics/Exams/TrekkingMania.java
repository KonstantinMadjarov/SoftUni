import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumMusala = 0;
        int sumMontblanc = 0;
        int sumKilimanjaro = 0;
        int sumK2 = 0;
        int sumEverest = 0;

        int totalPeople = 0;

        int groups = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= groups ; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            totalPeople +=people;

            if (people <= 5){
                sumMusala += people;
            } else if (people <= 12) {
                sumMontblanc += people;
            } else if (people <= 25) {
                sumKilimanjaro += people;
            } else if (people <= 40) {
                sumK2 += people;
            } else {
                sumEverest += people;
            }
        }

        double percentMusala = sumMusala * 1.0 / totalPeople * 100;
        System.out.printf("%.2f%%%n", percentMusala);
        double percentMontblanc = sumMontblanc * 1.0 / totalPeople * 100;
        System.out.printf("%.2f%%%n", percentMontblanc);
        double percentKilimanjaro = sumKilimanjaro * 1.0 / totalPeople * 100;
        System.out.printf("%.2f%%%n", percentKilimanjaro);
        double percentK2 = sumK2 * 1.0 / totalPeople * 100;
        System.out.printf("%.2f%%%n", percentK2);
        double percentEverest = sumEverest * 1.0 / totalPeople * 100;
        System.out.printf("%.2f%%%n",percentEverest);

    }
}
