package beginner.Snack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        double price;

        switch (x) {
            case 1:
                price = 4.00;
                break;
            case 2:
                price = 4.50;
                break;
            case 3:
                price = 5.00;
                break;
            case 4:
                price = 2.00;
                break;
            case 5:
                price = 1.50;
                break;

            default:
                price = 0.00;
                break;
        }

        double total = price * y;

        System.out.printf("Total: R$ %.2f\n", total);

        sc.close();
    }
}
