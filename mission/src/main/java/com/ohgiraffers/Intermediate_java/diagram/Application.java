package com.ohgiraffers.Intermediate_java.diagram;

public class Application {
    public static void main(String[] args) {
        Diagram[] diagramArr = new Diagram[3];

        diagramArr[0] = new Diagram("원", 25);
        diagramArr[1] = new Diagram("삼각형", 10);
        diagramArr[2] = new Diagram("사각형", 20);

        for (Diagram diagram : diagramArr) {
            diagram.getAreaSize();
        }
    }
}
