package beginner.EvenNumbers;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int number = 1;

        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
