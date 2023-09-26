import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int count = 1;
        boolean isEnough = false;

        for (int rows = 1; rows <= n ; rows++) {
            for (int i = 1; i <= rows ; i++) {

                System.out.print(count + " ");
                if (count == n) {
                    isEnough = true;
                    break;
                }
                count++;
            }
            if (isEnough) {
                break;
            }
            System.out.println();
        }
    }
}
