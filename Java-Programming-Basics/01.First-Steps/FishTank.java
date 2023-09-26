import java.util.Scanner;
public class FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Четене

      int length = Integer.parseInt(scanner.nextLine());
      int width = Integer.parseInt(scanner.nextLine());
      int height = Integer.parseInt(scanner.nextLine());
      double percent = Double.parseDouble(scanner.nextLine());

      // 2. Изчисление

        double volumeInCm = length * width * height;
        double volumeInLiters = volumeInCm / 1000;

       // 3. Изчисляваме чистият обем вода
       // Изпозлваме същата променлива, като я презаписваме!!!

        volumeInLiters = volumeInLiters - (volumeInLiters * (percent/100));

      // 4. Принтиране

        System.out.println(volumeInLiters);

    }
}
