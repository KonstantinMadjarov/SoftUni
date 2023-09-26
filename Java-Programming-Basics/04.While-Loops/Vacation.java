import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());

        int consecutiveSpending = 0;
        int daysCount = 0;

        while (ownedMoney < tripMoney){

            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            daysCount++;

            switch (action) {
                case "spend":
                    ownedMoney -= sum;
                    if (ownedMoney < 0) {
                        ownedMoney = 0;
                    }
                    consecutiveSpending ++;
                    break;
                case "save":
                    ownedMoney += sum;
                    consecutiveSpending = 0;
                    break;
            }

            if (consecutiveSpending == 5) {
                System.out.println("You can't save the money.");
                System.out.println(daysCount);
                break;
            }
        }

        if (ownedMoney >= tripMoney) {
            System.out.printf("You saved the money for %d days.", daysCount);
        }

    }
}
