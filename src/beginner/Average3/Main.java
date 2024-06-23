package beginner.Average3;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        float N1 = sc.nextFloat();
        float N2 = sc.nextFloat();
        float N3 = sc.nextFloat();
        float N4 = sc.nextFloat();

        float average = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;
        System.out.printf("Media: %.1f\n", average);

        if (average >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            float examScore = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", examScore);
            average = (average + examScore) / 2;
            if (average >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", average);
        }

        sc.close();
    }
}

