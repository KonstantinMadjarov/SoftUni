import java.util.Scanner;

public class TrapezoidArea {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double base1 = Double.parseDouble(scanner.nextLine());
        double base2 = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double area = (base1 + base2) * height / 2;

        System.out.printf("%.2f",area);

    }
}
