import java.util.Scanner;

public class Average2{
    public static void main(String[] args){
        //Declaration
        Scanner scanner = new Scanner(System.in);
        double weightA = 2;
        double weightB = 3;
        double weightC = 5;

        //Input
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        //Processing
        double average = ((A * weightA + B * weightB + C * weightC) / 10 );

        //Output
        System.out.printf("MEDIA = %.1f%n", average);
        scanner.close();
    }
}