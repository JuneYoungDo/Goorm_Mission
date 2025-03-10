package com.ohgiraffers.Intermediate_java.lambda;

import java.util.Scanner;
import java.util.function.BiFunction;

public class LambdaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        BiFunction<Double, Double, Double> operation;

        switch (operator) {
            case '+':
                operation = (a, b) -> a + b;
                break;
            case '-':
                operation = (a, b) -> a - b;
                break;
            case '*':
                operation = (a, b) -> a * b;
                break;
            case '/':
                operation = (a, b) -> b != 0 ? a / b : Double.NaN;
                break;
            default:
                System.out.println("올바른 연산자를 입력하세요.");
                return;
        }

        double result = operation.apply(num1, num2);
        System.out.println("결과: " + result);
    }
}

