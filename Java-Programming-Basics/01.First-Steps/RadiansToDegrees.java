import java.util.Scanner;

public class RadiansToDegrees {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double angleInRadians = Double.parseDouble(scanner.nextLine());
        double angleInDegrees = angleInRadians * 180 / Math.PI;

        System.out.println(angleInDegrees);

    }
}
