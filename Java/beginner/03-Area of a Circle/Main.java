import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        //Declaration
        double PI = 3.14159;

        Scanner scanner = new Scanner(System.in);
   
        //Input
        double R = scanner.nextDouble();

        //Processing
        double A = PI * R * R;

        //Output
        System.out.printf("A=%.4f%n", A);
        scanner.close();
    }
}
