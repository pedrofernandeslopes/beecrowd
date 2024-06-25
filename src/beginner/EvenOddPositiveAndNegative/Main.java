package beginner.EvenOddPositiveAndNegative;

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int even = 0;
        int odd = 0;
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            if (numbers[i] > 0) {
                positive++;
            } else if(numbers[i] < 0) {
                negative++;
            }
        }

        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");

        sc.close();
    }
}
