import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();

        final double PI = 3.14159;

        double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);

        System.out.printf("VOLUME = %.3f\n", volume);

        scanner.close();
    }
}
