package beginner.Salary;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); 

        int numeroFuncionario = sc.nextInt(); 
        int horasTrabalhadas = sc.nextInt(); 
        double valorPorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        sc.close();
    }
}

