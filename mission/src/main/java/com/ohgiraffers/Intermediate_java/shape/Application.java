package com.ohgiraffers.Intermediate_java.shape;

public class Application {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 7);

        System.out.println("원 면적: " + circle.calculateArea());
        System.out.println("사각형 면적: " + rectangle.calculateArea());
        System.out.println("삼각형 면적: " + triangle.calculateArea());
    }
}
