package com.ohgiraffers.basic_java_1;

import java.util.Scanner;

public class SumAndCompare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요 : ");
        int firstNum = scanner.nextInt();
        System.out.println("두번째 숫자를 입력하세요 : ");
        int secondNum = scanner.nextInt();

        if (firstNum > secondNum) {
            System.out.println("첫번째 숫자인 [" + firstNum + "]이 더 큰 숫자입니다.");
        } else if (firstNum < secondNum) {
            System.out.println("두번째 숫자인 [" + secondNum + "]이 더 큰 숫자입니다.");
        } else {
            System.out.println("두 숫자는 같은 숫자입니다.");
        }

//        System.out.println("첫번째 숫자를 입력하세요 : ");
//        int firstNum = scanner.nextInt();
//        System.out.println("두번째 숫자를 입력하세요 : ");
//        int secondNum = scanner.nextInt();
//
//        System.out.println("두 숫자의 합은 [" + (firstNum + secondNum) + "] 입니다.");
    }
}
