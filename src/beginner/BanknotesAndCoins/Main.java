package beginner.BanknotesAndCoins;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();

        int[] notes = { 100, 50, 20, 10, 5, 2 };
        double[] coins = { 1.0, 0.5, 0.25, 0.10, 0.05, 0.01 };

        int remaining = (int) (N * 100 + 0.5);

        System.out.println("NOTAS:");
        for (int note : notes) {
            int noteCount = remaining / (note * 100);
            System.out.printf("%d nota(s) de R$ %.2f%n", noteCount, (double) note);
            remaining %= note * 100;
        }

        System.out.println("MOEDAS:");
        for (double coin : coins) {
            int coinCount = remaining / (int) (coin * 100);
            System.out.printf("%d moeda(s) de R$ %.2f%n", coinCount, coin);
            remaining %= (int) (coin * 100);
        }

        sc.close();
    }
}
