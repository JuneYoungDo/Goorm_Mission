package com.ohgiraffers.Intermediate_java;

import java.util.Scanner;

public class UpperAndReverseString {
    public static String upper(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }

    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        char[] reversedChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversedChars[i] = chars[chars.length - i - 1];
        }
        return new String(reversedChars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println("문자열 뒤집기: " + reverse(s));
        System.out.println("대문자 변환: " + upper(s));

        System.out.println("대문자 변환 후 문자열 뒤집기: " + reverse(upper(s)));
    }
}
