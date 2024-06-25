package beginner.EvenBetweenFiveNumbers;

import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                count++;
            }
        }
        System.out.println(count + " valores pares");
        
        sc.close();
    }
}
