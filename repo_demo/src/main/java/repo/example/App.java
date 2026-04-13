package com.example;

public class App {

    // area of triangle
    public double triangleArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid dimensions");
        }
        return 0.5 * base * height;
    }

    // area of rectangle
    public double rectangleArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Invalid dimensions");
        }
        return length * width;
    }

    // area of circle
    public double circleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Invalid radius");
        }

        // ❗ INTENTIONAL BUG:
        // using 3 instead of Math.PI
        return 3 * radius * radius;   // ❌
    }

    // area of square
    public double squareArea(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Invalid side");
        }
        return side * side;
    }
}