package beginner.Distance;

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();

        System.out.printf("%d minutos\n", 2 * distance);

        sc.close();  
    }
}
