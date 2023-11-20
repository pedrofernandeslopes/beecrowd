import java.util.Scanner;

public class Salary{
    public static void main(String[] args){

        //Declaration
        Scanner scanner = new Scanner(System.in);

        //Input
        int employeeNumber = scanner.nextInt();
        int workedHours = scanner.nextInt();
        double hourlyRate = scanner.nextDouble();

        //Processing
        double salary =  workedHours * hourlyRate;

        //Output
        System.out.printf("NUMBER = %s\n", employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", salary);
        
        scanner.close();
    }
}