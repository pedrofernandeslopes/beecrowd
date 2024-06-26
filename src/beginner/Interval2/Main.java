package beginner.Interval2;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        int inCount = 0;
        int outCount = 0;

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();

            if (X >= 10 && X <= 20) {
                inCount++;
            } else {
                outCount++;
            }
        }

        sc.close();

        System.out.println(inCount + " in");
        System.out.println(outCount + " out");
    }
}
