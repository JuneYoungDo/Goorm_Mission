package com.ohgiraffers.Intermediate_java.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
         * 시스템 요구사항
         * 1. 제빵사는 오븐켜기, 오븐 온도 올리기, 오븐 온도 내리기, 오븐끄기를 할 수 있다.
         * 2. 오븐은 전원켜기, 온도 올리기, 온도 내리기, 전원 끄기를 할 수 있다.
         * 3. 오븐은 최초 꺼져있는 상태로 대기한다.
         * 4. 제빵사는 먼저 오븐을 켠다. 이미 켜져있는 경우, 다시 오븐을 킬 수 없다.
         * 5. 제빵사가 오븐의 온도를 올리면, 오븐이 켜져있는 경우 온도가 10도 올라간다.
         * 6. 오븐이 켜져있는 경우, 온도를 내리면 온도는 10도 떨어진다. 온도는 0도 이하로 내려가지 않는다.
         * 7. 온도를 내릴때 오븐이 켜져있는 경우가 아니라면 이미 꺼져있는 상태라고 안내한다.
         * 8. 제빵사가 오븐을 끄면 더 이상 오븐은 작동하지 않는다.
         * 9. 오븐이 10도 이상의 온도라면, 오븐을 끌 수 없다.
         */

        /* 프로그램 설계하기
         * 목차 1. 필요한 객체 도출
         *  - 플레이어(사용자), 제빵사, 오븐
         *
         * 목차2. 객체간 상호작용
         *  - 제빵사가 수신할 수 있는 메세지(제빵사가 해야하는 일)
         *  1. 오븐을 켜라
         *  2. 오븐의 온도를 올려라
         *  3. 오븐의 온도를 내려라
         *  4. 오븐을 꺼라
         *
         *  - 오븐이 수신할 수 있는 메세지(오븐이 해야하는 일)
         *  1. 전원을 켜라
         *  2. 온도를 올려라
         *  3. 온도를 내려라
         *  4. 전원을 꺼라
         */

        Baker baker = new Baker();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("======== 제빵 프로그램 ==========");
            System.out.println("1. 전원 켜기");
            System.out.println("2. 온도 올리기");
            System.out.println("3. 온도 내리기");
            System.out.println("4. 전원 끄기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = scanner.nextInt();

            switch (no) {
                case 1: baker.powerOn();break;
                case 2: baker.increaseTemperature();break;
                case 3: baker.decreaseTemperature();break;
                case 4: baker.powerOff();break;
                case 9: System.out.println("프로그램을 종료합니다."); break;
                default: System.out.println("잘못된 번호를 선택하셨습니다.");break;
            }

            if(no == 9) {
                break;
            }
        }

    }
}
