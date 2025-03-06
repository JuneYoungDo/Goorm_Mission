package com.ohgiraffers.Intermediate_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorWithException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = scanner.nextDouble();
            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = scanner.nextDouble();
            System.out.print("연산자(+,-,*,/)를 입력하세요: ");
            char operator = scanner.next().charAt(0);

            double result = calculate(num1, num2, operator);
            System.out.println("결과: " + result);
        } catch (InputMismatchException e) {
            System.out.println("입력 오류: 숫자를 올바르게 입력하세요.");
        } catch (ArithmeticException e) {
            System.out.println("수학 오류: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 연산자: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("알 수 없는 오류 발생: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("지원되지 않는 연산자입니다: " + operator);
        }
    }
}
