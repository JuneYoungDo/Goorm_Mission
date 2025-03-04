package com.ohgiraffers.basic_java_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithSort {
    public static void main(String[] args) {

//        int[] arr = new int[10];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;
//        arr[5] = 6;
//        arr[6] = 7;
//        arr[7] = 8;
//        arr[8] = 9;
//        arr[9] = 10;
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        int[] arr = new int[5];
//
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;
//
//        int sum =0;
//        for(int i=0; i<arr.length; i++) {
//            sum += arr[i];
//        }
//
//        int avg = sum / arr.length;
//        System.out.println("평균: " + avg);
//
//        arr[2] = 10;
//        arr[3] = 12;
//
//        sum = 0;
//        for(int i=0; i<arr.length; i++) {
//            sum += arr[i];
//        }
//        avg = sum / arr.length;
//        System.out.println("값 변경 후 평균: " + avg);

        int[] arr = new int[5];

        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("숫자를 입력하세요: ");
            int num = scanner.nextInt();
            arr[i] = num;
        }

        Arrays.sort(arr);
        for(int i=0;i<5;i++) {
            System.out.println(arr[i]);
        }

    }
}
