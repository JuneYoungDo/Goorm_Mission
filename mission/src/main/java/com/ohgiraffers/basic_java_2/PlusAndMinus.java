package com.ohgiraffers.basic_java_2;

import java.util.Scanner;

public class PlusAndMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력하세요 : ");
        int firstNum = scanner.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        int secondNum = scanner.nextInt();

        plusAndMinus(firstNum, secondNum);
    }

    public static void plusAndMinus(int fnum, int snum) {
        System.out.println(fnum + " + " + snum + " = " + (fnum + snum));
        System.out.println(fnum + " - " + snum + " = " + (fnum - snum));
    }
}
