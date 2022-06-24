package kosta.jihogrammer.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    @DisplayName("정사각형 생성")
    void construct() {
        Square square = new Square(1);
        assertInstanceOf(Shape.class, square);
    }
    @Test
    @DisplayName("정사각형 넓이")
    void area() {
        Square square = new Square(1.4);
        assertEquals(1.96, Math.round(square.getArea() * 100) / 100.0);
    }
}