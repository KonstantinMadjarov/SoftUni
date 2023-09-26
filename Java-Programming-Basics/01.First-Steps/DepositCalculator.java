import java.sql.SQLOutput;
import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1.	Депозирана сума – реално число в интервала [100.00 … 10000.00]
        //2.	Срок на депозита (в месеци) – цяло число в интервала [1…12]
        //3.	Годишен лихвен процент – реално число в интервала [0.00 …100.00]

        double depositAmount = Double.parseDouble(scanner.nextLine());
        int depositPeriod = Integer.parseInt(scanner.nextLine());
        double depositPercent = Double.parseDouble(scanner.nextLine()) / 100;

        double sum = depositAmount + depositPeriod * ((depositAmount * depositPercent) / 12);


        System.out.println(sum);
    }
}
