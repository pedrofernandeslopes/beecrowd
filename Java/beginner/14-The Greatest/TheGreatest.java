import java.util.Scanner;

public class TheGreatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int value3 = scanner.nextInt();

        if (value1 > value2 && value1 > value3) {
            System.out.println(value1 + " eh o maior");
        } else if (value2 > value3) {
            System.out.println(value2 + " eh o maior");
        } else {
            System.out.println(value3 + " eh o maior");
        }
        scanner.close();
    }
}
