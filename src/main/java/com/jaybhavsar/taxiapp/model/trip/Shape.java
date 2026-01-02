package com.jaybhavsar.taxiapp.model.trip;

public interface Shape {
    double area();
}

// Hidden implementation this classes are hidden.
class Circle implements Shape {

    private final double radius;

    Circle( double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius;
    }
}

class Rectangle implements Shape {

    private final double length;
    private final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}