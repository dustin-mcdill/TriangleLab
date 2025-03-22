package recursionlab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriangleNumberCalculator {

    public int value(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + value(n - 1);
    }

    public int add(int n, int m) {
        return value(n) + value(m);
    }

    public int subtract(int n, int m) {
        return value(n) - value(m);
    }
    
    public int multiply(int n, int m) {
        return value(n) * value(m);
    }
    
    public double divide(int n, int m) {
        if (value(m) == 0) {
            throw new ArithmeticException("Division by zero is impossible silly.");
        }
        return (double) value(n) / value(m);
    }
    
    public List<Integer> sequence(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(value(i));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();

        System.out.print("Enter a number for triangular value: ");
        int n = scanner.nextInt();
        System.out.println("Triangle number of " + n + ": " + calculator.value(n));

        System.out.print("Enter two numbers for addition: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Addition of " + num1 + "th and " + num2 + "th triangular numbers: " + calculator.add(num1, num2));

        System.out.print("Enter two numbers for subtraction: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.println("Subtraction of " + num1 + "th and " + num2 + "th triangular numbers: " + calculator.subtract(num1, num2));

        System.out.print("Enter two numbers for multiplication: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.println("Multiplication of " + num1 + "th and " + num2 + "th triangular numbers: " + calculator.multiply(num1, num2));

        System.out.print("Enter two numbers for division: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        if (num2 == 0) {
            System.out.println("Error: Division by zero is impossible silly.");
        } else {
            System.out.println("Division of " + num1 + "th and " + num2 + "th triangular numbers: " + calculator.divide(num1, num2));
        }

        System.out.print("Enter a number to generate a triangular sequence: ");
        int seqNum = scanner.nextInt();
        System.out.println("Sequence up to " + seqNum + ": " + calculator.sequence(seqNum));

        scanner.close();
    }
}
