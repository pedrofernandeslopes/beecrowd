package beginner.FuelSpend;

import java.io.IOException;
import java.util.Scanner;
 

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int tempo = sc.nextInt();
        int distancia = sc.nextInt();

        double consumo = tempo * distancia / 12.0;

        System.out.printf("%.3f\n", consumo);

        sc.close();
    }
 
}
