package com.codecool;

public class Rectangle extends Shape {
    int sideA = 0;
    int sideB = 0;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void speak() {
        System.out.println("I'm a rectangle");
    }
}
