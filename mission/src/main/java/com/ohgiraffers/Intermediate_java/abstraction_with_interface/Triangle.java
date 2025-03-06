package com.ohgiraffers.Intermediate_java.abstraction_with_interface;

class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        super("삼각형");
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
