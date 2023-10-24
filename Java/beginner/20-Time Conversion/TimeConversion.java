import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int hours = N / 3600;
        int minutes = (N % 3600) / 60;
        int seconds = N % 60;

        System.out.printf("%d:%d:%d%n", hours, minutes, seconds);

        scanner.close();
    }
}


