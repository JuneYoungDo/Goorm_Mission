package com.ohgiraffers.Intermediate_java.inheritance;

public class Application {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 25);
        System.out.println(employee.getInformation());

        Manager manager = new Manager("Dean", 30, "MANAGER");
        System.out.println(manager.getInformation());
    }
}
