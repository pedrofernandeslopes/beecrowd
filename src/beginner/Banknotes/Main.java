package beginner.Banknotes;

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        int[] notes = {100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[notes.length];

        int amount = N;

        for (int i = 0; i < notes.length; i++) {
            count[i] = amount / notes[i];
            amount = amount % notes[i];
        }

        System.out.println(N);

        for (int i = 0; i < notes.length; i++) {
            System.out.println(count[i] + " nota(s) de R$ " + notes[i] + ",00");
        }
    }
 
}
