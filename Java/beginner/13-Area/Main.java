import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        final double PI = 3.14159;

        double triangleArea = (A * C) / 2.0;
        System.out.printf("TRIANGULO: %.3f\n", triangleArea);

        double circleArea = PI * C * C;
        System.out.printf("CIRCULO: %.3f\n", circleArea);

        double trapeziumArea = ((A + B) * C) / 2.0;
        System.out.printf("TRAPEZIO: %.3f\n", trapeziumArea);

        double squareArea = B * B;
        System.out.printf("QUADRADO: %.3f\n", squareArea);

        double rectangleArea = A * B;
        System.out.printf("RETANGULO: %.3f\n", rectangleArea);

        scanner.close();
    }
}
