package com.ohgiraffers.basic_java_2;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("사각형의 세로 길이를 입력하세요: ");
        int height = scanner.nextInt();
        System.out.println("사각형의 가로 길이를 입력하세요: ");
        int width = scanner.nextInt();

        System.out.println("사각형의 넓이는 [" + calculateRectangleArea(height, width) + "] 입니다.");
    }

    public static int calculateRectangleArea(int height, int width) {
        return height * width;
    }
}
