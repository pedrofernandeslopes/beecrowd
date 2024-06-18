package beginner.TheGreatest;

import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorABC = Math.max(maiorAB, c);

        System.out.println(maiorABC + " é o maior");

        sc.close();
    }
}
