import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1.	Броят на опаковките храна за кучета – цяло число в интервала [0… 100]
        //2.	Броят на опаковките храна за котки –  цяло число в интервала [0… 100]

        int dogs = Integer.parseInt(scanner.nextLine());
        int cats = Integer.parseInt(scanner.nextLine());

        double result = (dogs * 2.50) + (cats * 4.00);

        System.out.printf("%f lv.", result);

    }
}
