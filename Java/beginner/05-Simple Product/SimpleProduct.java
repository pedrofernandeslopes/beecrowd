import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args){

        //Declaration
        Scanner scanner = new Scanner(System.in);

        //Input
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        //Processing
        int product = A * B;

        //Output
        System.out.printf("PROD = %d\n", product);
        scanner.close();
    }
}




