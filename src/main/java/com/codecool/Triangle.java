package com.codecool;

public class Triangle extends Shape {
    int base = 0;
    int baseHeight = 0;

    public Triangle(int base, int baseHeight) {
        this.base = base;
        this.baseHeight = baseHeight;
    }

    @Override
    public void speak() {
        System.out.println("I'm a triangle");
    }

}
