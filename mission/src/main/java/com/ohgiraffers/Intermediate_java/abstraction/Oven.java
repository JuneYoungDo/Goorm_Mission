package com.ohgiraffers.Intermediate_java.abstraction;

public class Oven {

    private boolean isOn;
    private int temperature;

    public void powerOn() {
        if (isOn) {
            System.out.println("이미 전원이 켜져 있습니다.");
        } else {
            this.isOn = true;
            System.out.println("전원이 켜졌습니다.");
        }
    }

    public void increaseTemperature() {
        if (isOn) {
            System.out.println("온도를 10도 올립니다.");
            this.temperature += 10;
            System.out.println("현재 오븐의 온도는 " + this.temperature + "도 입니다.");
        } else {
            System.out.println("오븐이 켜져있지 않습니다. 먼저 오븐을 켜주세요.");
        }
    }

    public void decreaseTemperature() {
        if (isOn) {
            if(this.temperature > 0) {
                System.out.println("온도를 10도 낮췄습니다.");
                this.temperature -= 10;
                System.out.println("현재 오븐의 온도는 " + this.temperature + "도 입니다.");
            }else {
                System.out.println("이미 오븐의 온도가 0도 입니다.");
            }
        } else {
            System.out.println("오븐이 켜져있지 않습니다. 먼저 오븐을 켜주세요.");
        }
    }

    public void powerOff() {
        if(isOn) {
            if(this.temperature > 0) {
                System.out.println("아직 오븐이 0도가 되지 않았습니다. 온도를 먼저 낮춰주세요.");
            } else {
                this.isOn = false;
                System.out.println("오븐을 껐습니다. 다시 작동하려면 오븐을 켜주세요");
            }
        } else {
            System.out.println("이미 전원이 꺼져있습니다.");
        }
    }
}
