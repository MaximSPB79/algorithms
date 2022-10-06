package lesson_5.degree_calculator;

import java.util.Scanner;

public class DegreeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(degree(scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }

    private static int degree(int x, int n) {
        if (n == 1) {
            return x;
        } else {
            return x * degree(x, n - 1);
        }
    }
}
