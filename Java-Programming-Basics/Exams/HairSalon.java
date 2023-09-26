import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());

        int income = 0;

        String input = scanner.nextLine();
        while(!input.equals("closed")) {

            String service = input;
            String type = scanner.nextLine();

            switch (service) {

                case "haircut":
                    if(type.equals("mens")) {
                        income += 15;
                    }else if (type.equals("ladies")) {
                        income += 20;
                    } else if (type.equals("kids")) {
                        income += 10;
                    }
                    break;
                case "color":
                    if (type.equals("touch up")) {
                        income += 20;
                    } else if (type.equals("full color")) {
                        income += 30;
                }

                    break;
            }

            if (income >= target) {
                System.out.println("You have reached your target for the day!");
                System.out.printf("Earned money: %dlv.", income);
                break;
            }

            input = scanner.nextLine();
        }
        if (input.equals("closed")) {
            System.out.printf("Target not reached! You need %dlv. more.%n", target - income);
            System.out.printf("Earned money: %dlv.", income);
        }


    }
}
