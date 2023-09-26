import java.util.Scanner;
public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examTimeInMinutes = (examHour * 60) + examMinute;
        int arrivalTimeInMinutes = (arrivalHour * 60) + arrivalMinute;


        int diff = Math.abs(examTimeInMinutes - arrivalTimeInMinutes);


        if (examTimeInMinutes < arrivalTimeInMinutes) {
            System.out.printf("Late%n");
            int hour = diff / 60;
            int min = diff % 60;
            if (diff < 60) {
                System.out.printf("%d minutes after the start", min);
            } else {
                System.out.printf("%d:%02d hours after the start", hour, min);
            }
        }
        if(examTimeInMinutes >= arrivalTimeInMinutes && diff <= 30) {
            if (examTimeInMinutes == arrivalTimeInMinutes) {
                System.out.printf("On Time");
            } else {
                System.out.printf("On Time%n");
                System.out.printf("%d minutes before the start", diff);
            }
        }

        if (examTimeInMinutes > arrivalTimeInMinutes && diff > 30) {
            System.out.printf("Early%n");
            int hour = diff / 60;
            int min = diff % 60;
            if (diff < 60) {
                System.out.printf("%d minutes before the start", min);
            } else {
                System.out.printf("%d:%02d hours before the start", hour, min);
            }
        }

    }
}
