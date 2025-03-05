package com.ohgiraffers.Intermediate_java.diagram;

public class Diagram {

    private String type;
    private int areaSize;

    public Diagram(String type, int areaSize) {
        this.type = type;
        this.areaSize = areaSize;
    }

    public void getAreaSize() {
        System.out.println(type + "의 넓이는 " + areaSize + " 입니다");
    }
}
