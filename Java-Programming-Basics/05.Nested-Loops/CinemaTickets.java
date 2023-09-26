import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int counterKid = 0;
        int counterStandard = 0;
        int counterStudent = 0;
        int counter = 0;

        while (!movie.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String input = scanner.nextLine();
            int currentCounter = 0;
            while (!input.equals("End")) {
                currentCounter++;
                counter++;
                switch (input) {
                    case "student":
                        counterStudent++;
                        break;
                    case "kid":
                        counterKid++;
                        break;
                    case "standard":
                        counterStandard++;
                        break;
                }
                if(currentCounter == freeSeats){
                    break;
                }
                input = scanner.nextLine();

            }
            System.out.printf("%s - %.2f%% full.%n", movie, currentCounter * 1.00 / freeSeats * 100);

            movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n",counter);
        System.out.printf("%.2f%% student tickets.%n",counterStudent * 1.00 / counter * 100);
        System.out.printf("%.2f%% standard tickets.%n",counterStandard * 1.00 / counter * 100);
        System.out.printf("%.2f%% kids tickets.",counterKid * 1.00 / counter * 100);

    }
}
