import java.util.Scanner;

public class Difference{
    public static void main(String[] args){

        //Declaration
        Scanner scanner = new Scanner(System.in);

        //Input
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        //Processing
        int DIFERENCA = (A * B - C * D);

        //Output
        System.out.println("DIFERENCA = " + DIFERENCA);
        
        scanner.close();
    }
}
