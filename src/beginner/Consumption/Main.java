package beginner.Consumption;

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double distanciaPercorrida = sc.nextDouble();
        double consumoDeCombustivel = sc.nextDouble();

        double consumoMedio = distanciaPercorrida / consumoDeCombustivel;

        System.out.printf("%.3f km/l\n", consumoMedio);
        
        sc.close();
    }
 
}

