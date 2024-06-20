package beginner.TimeConvertion;

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int hours = N / 3600;
        int minutes = (N % 3600) / 60;
        int seconds = N % 60;

        System.out.printf("%d:%d:%d%n", hours, minutes, seconds);

        scanner.close();
    }
}
