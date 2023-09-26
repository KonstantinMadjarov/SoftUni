import java.util.Scanner;

public class CharsToString_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);


        //System.out.println(String.valueOf(first) + String.valueOf(second) + String.valueOf(third));

        System.out.printf("%c%c%c%n", first, second, third);



    }
}
