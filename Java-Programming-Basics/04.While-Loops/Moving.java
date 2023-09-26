import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Широчина на свободното пространство - цяло число в интервала [1...1000]
        //2.	Дължина на свободното пространство - цяло число в интервала [1...1000]
        //3.	Височина на свободното пространство - цяло число в интервала [1...1000]
        //4.	На следващите редове (до получаване на команда "Done") - брой кашони, които се пренасят в квартирата - цяло число в интервала [1...10000]

        int widthFreeSpace = Integer.parseInt(scanner.nextLine());
        int lengthFreeSpace = Integer.parseInt(scanner.nextLine());
        int heightFreeSpace = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int freeSpace = widthFreeSpace * lengthFreeSpace * heightFreeSpace;


        while (!input.equals("Done")){
            int boxCount = Integer.parseInt(input);
            freeSpace -= boxCount;

            if (freeSpace <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
                break;
            }
            input = scanner.nextLine();
        }

            if (input.equals("Done")) {
                System.out.printf("%d Cubic meters left.", freeSpace);
            }

    }
}
