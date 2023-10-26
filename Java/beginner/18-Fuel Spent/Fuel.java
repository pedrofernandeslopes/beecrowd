import java.util.Scanner;

public class Fuel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int averageSpeed  = scanner.nextInt();
        int time = scanner.nextInt();

        double distance = averageSpeed * time;
        
        double fuel  = distance / 12;

        System.out.printf("%.3f%n", fuel);
        scanner.close();
    }
}
