import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args){

        //Declaration
        Scanner scanner = new Scanner(System.in);

        //Input
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        //Processing
        int sum = A + B;

        //Output
        System.out.printf("SOMA = %d\n", sum);
        scanner.close();
    }
}



