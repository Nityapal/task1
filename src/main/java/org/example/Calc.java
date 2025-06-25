package org.example;

import java.util.Scanner;

public class Calc {
    public static double add(double a, double b) {
        return a+b;
    }

    public static double subtract(double a, double b) {
        return a-b;
    }

    public static double multiply(double a, double b) {
        return a*b;
    }

    public static double divide(double a, double b) {
        if(b==0) {
            System.out.println("you cannot divide by zero");
        }
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Java Console Calculator");
        System.out.println("Type 'exit' to quit.\n");

        while (true) {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, / or 'exit'): ");
            String op = sc.next();

            if (op.equalsIgnoreCase("exit")) break;
            char operator = op.charAt(0);

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double result;
            switch (operator) {
                case '+':
                    result = add(a, b);
                    break;
                case '-':
                    result = subtract(a, b);
                    break;
                case '*':
                    result = multiply(a, b);
                    break;
                case '/':
                    result = divide(a, b);
                    break;
                default:
                    System.out.println("Invalid operator");
                    continue;
            }

            System.out.println("Result: " + result);
        }
        System.out.println("Calculation done.");
    }
}