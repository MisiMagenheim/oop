package com.codecool;

public class Square extends Rectangle{
    int side = 0;

    public Square(int sideA, int sideB, int side) {
        super(sideA, sideB);
        this.side = side;
    }

    @Override
    public void speak() {
        System.out.println("I'm a square");
    }

}
