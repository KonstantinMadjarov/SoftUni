import java.util.Scanner;

public class BasketballEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double annualFee = Double.parseDouble(scanner.nextLine());

        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        double sneakers = annualFee - (annualFee * 0.40);
        double suit = sneakers - (sneakers * 0.20);
        double ball = suit / 4;
        double accessoires = ball / 5;

        double totalSum = annualFee + sneakers + suit + ball + accessoires;

        System.out.println(totalSum);
    }
}
