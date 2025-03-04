package com.ohgiraffers.Intermediate_java;

public class Square {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void getArea() {
        System.out.println("사각형의 넓이: " + (width * height));
    }
}
