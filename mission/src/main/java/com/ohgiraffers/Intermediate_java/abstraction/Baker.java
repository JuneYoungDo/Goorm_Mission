package com.ohgiraffers.Intermediate_java.abstraction;

public class Baker {

    private final Oven oven = new Oven();

    public void powerOn() {
        oven.powerOn();
    }

    public void powerOff() {
        oven.powerOff();
    }

    public void increaseTemperature() {
        oven.increaseTemperature();
    }

    public void decreaseTemperature() {
        oven.decreaseTemperature();
    }
}
