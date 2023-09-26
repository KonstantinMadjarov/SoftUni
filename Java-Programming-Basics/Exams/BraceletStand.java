import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – джобните на Тереза на ден – реално число в интервала [1.00 ...100.00]
        //•	Втори ред – парите, които тя печели на ден от продажби – реално число в интервала [1.00...1000.00]
        //•	Трети ред – разходите на Тереза за целия период – реално число в интервала [1.00...1000.00]
        //•	Четвърти ред – цената на подаръка – реално число в интервала [1.00...10000.00]

        double pocketMoney = Double.parseDouble(scanner.nextLine());
        double wonMoneyPerDay = Double.parseDouble(scanner.nextLine());
        double cost = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        int period = 5;

        double savedPocketMoney = period * pocketMoney;
        double wonMoney = period * wonMoneyPerDay;
        double totalSavedMoney = savedPocketMoney + wonMoney;

        double finalMoney = totalSavedMoney - cost;

        if (finalMoney >= giftPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", finalMoney);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", giftPrice - finalMoney);
        }



    }
}
