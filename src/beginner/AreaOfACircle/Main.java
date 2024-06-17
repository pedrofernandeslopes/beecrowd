package beginner.AreaOfACircle;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        
        double R = scanner.nextDouble();
        
        final double PI = 3.14159;
        
        double area = PI * R * R;
        
        System.out.printf("A=%.4f%n", area);
        
        scanner.close();
    }
}

