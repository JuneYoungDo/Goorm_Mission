package com.ohgiraffers.Intermediate_java.abstraction_with_interface;

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        super("사각형");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
