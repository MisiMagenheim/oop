package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class ShapeList {

    private List<Shape> listOfShapes;

    public ShapeList(List<Shape> listOfShapes) {
        this.listOfShapes = listOfShapes;
    }

    public void addShape(Shape) {
        for (int i = 0; i < listOfShapes.size(); i++) {
            Shape shape = listOfShapes.get(i);
            listOfShapes.add(Shape);
        }
    }

    public Shape getLargest() {
        Shape largestShape;
        for (int i = 0; i < listOfShapes.size(); i++) {
            if (listOfShapes.get(i).getArea().
        }

    }

    public void compareArea (Shape shape1, Shape shape2) {
        Shape winner = null;
        if (shape1.getArea() > shape2.getArea()) {
            winner = shape1;

        } else if (shape1.getArea() < shape2.getArea()) {
            winner = shape2;
        }
        if (winner == null) {
            System.out.println("Equal areas");
        }
        System.out.println(winner.speak());
    }
}
