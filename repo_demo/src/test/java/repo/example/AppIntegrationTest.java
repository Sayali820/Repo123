package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppIntegrationTest {

    @Test
    void testCombinedAreaFlow() {

        App app = new App();

        double square = app.squareArea(4);        // 16
        double rectangle = app.rectangleArea(square, 2);  // 32
        double triangle = app.triangleArea(rectangle, 2); // 32

        assertEquals(32, triangle);
    }

    @Test
    void testCircleAndSquareFlow() {

        App app = new App();

        double square = app.squareArea(3);   // 9
        double circle = app.circleArea(3);   // 27 (buggy logic)

        assertTrue(circle > square);
    }
}