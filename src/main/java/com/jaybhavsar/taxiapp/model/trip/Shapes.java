package com.jaybhavsar.taxiapp.model.trip;

// Noninstantiable companion class with static factory methods
public final class Shapes {

    private Shapes(){}; // noninstantiable

    //static factory method
    //return interface type
    //actual object is hidden subtypes
    public static Shape circle(double radius) {
        return new Circle(radius);
    }

    //static factory method
    public static Shape rectangle(double lenth, double width) {
        return new Rectangle(lenth, width);
    }

}
