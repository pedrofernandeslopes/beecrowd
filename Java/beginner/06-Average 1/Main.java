import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declaration
        Scanner scanner = new Scanner(System.in);
        double weightA = 3.5;
        double weightB = 7.5;

        // Input
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        // Processing
        double average = ((A * weightA) + (B * weightB)) / (weightA + weightB);

        // Output
        System.out.printf("MEDIA = %.5f%n", average);
        scanner.close();
    }
}