package com.ohgiraffers.Intermediate_java.abstraction_with_interface;

abstract class Shape implements ShapeInterface {
    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void displayArea() {
        System.out.println(name + " 의 면적: " + calculateArea());
    }
}
