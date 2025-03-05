package com.ohgiraffers.Intermediate_java.inheritance;

public class Manager extends Employee {
    private String role;

    public Manager(String name, int salary, String role) {
        super(name, salary);
        this.role = role;
    }

    @Override
    public String getInformation() {
        return super.getInformation() + ", role: " + role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
