package beginner.SalaryWithBonus;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); 

        String nomeVendedor = sc.nextLine(); 
        double salarioFixo = sc.nextDouble(); 
        double totalVendas = sc.nextDouble(); 

        double salarioFinal = salarioFixo + totalVendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);

        sc.close(); 
    }
}

