import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String[] args) {

        //Declaration
        Scanner scanner = new Scanner(System.in);

        //Input
        String name = scanner.nextLine();
        double fixedSalary  = scanner.nextDouble();
        double totalSales = scanner.nextDouble();
        

        //Processing
        double comission = totalSales * 0.15;
        double totalSalary = fixedSalary + comission;

        //Output
        System.out.printf("TOTAL = R$ %.2f\n", totalSalary);

        scanner.close();
    }
}
