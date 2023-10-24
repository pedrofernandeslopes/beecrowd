import java.util.Scanner;

public class BankNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        System.out.println("Informe a quantia: " + value);

        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[7];

        for (int i = 0; i < 7; i++) {
            count[i] = value / banknotes[i];
            value %= banknotes[i];
            System.out.println(count[i] + "nota(s) de R$ " + banknotes[i] + ",00 (s)");
        }
        scanner.close();
    }
}