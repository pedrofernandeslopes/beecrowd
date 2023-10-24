import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();

        int time = distance * 2;

        System.out.printf("%d minutos%n", time);

        scanner.close();
    }
}