package beginner.Average1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble(); 
        double B = sc.nextDouble();

        double media = (A * 3.5 + B * 7.5) / (3.5 + 7.5);

        System.out.printf("MEDIA = %.5f\n", media);
        sc.close();
    }
}

