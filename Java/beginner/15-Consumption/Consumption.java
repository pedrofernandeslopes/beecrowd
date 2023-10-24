import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDistance = scanner.nextInt();
        double totalFuel = scanner.nextDouble();

        double avarageConsumption = totalDistance / totalFuel;

        System.out.printf("%.3f km/l\n", avarageConsumption);

        scanner.close();
    }
}
