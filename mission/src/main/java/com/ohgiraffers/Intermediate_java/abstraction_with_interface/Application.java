package com.ohgiraffers.Intermediate_java.abstraction_with_interface;

public class Application {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 5);
        Shape triangle = new Triangle(5, 5);

        circle.displayArea();
        rectangle.displayArea();
        triangle.displayArea();
    }
}
