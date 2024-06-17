package beginner.SimpleCalculate;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int codigoProduto1 = sc.nextInt(); 
        int quantidadeProduto1 = sc.nextInt();
        double precoProduto1 = sc.nextDouble();

        int codigoProduto2 = sc.nextInt(); 
        int quantidadeProduto2 = sc.nextInt();
        double precoProduto2 = sc.nextDouble();

        double valorTotal = quantidadeProduto1 * precoProduto1 + quantidadeProduto2 * precoProduto2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        sc.close();
    }
}

