import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double celsiusDegrees = Double.parseDouble(scanner.nextLine());


        //T (° F) = T (° C) × 1,8 + 32

        double fahrenheitDegrees = celsiusDegrees * 1.8 + 32;

        System.out.printf("%.2f", fahrenheitDegrees);


    }
}
