package com.example.tritypejunittest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TritypeMCDCTest {

    @Test
    public void testTritypeMCDC1() {
        // Side1 + Side2 <= Side3
        // not a triangle
        assertEquals(4, Tritype.Triang(1, 2, 4));
    }

    @Test
    public void testTritypeMCDC2() {
        // Side1 + Side2 <= Side3
        // triangle
        assertEquals(1, Tritype.Triang(3, 4, 5));
    }

    @Test
    public void testTritypeMCDC3() {
        // Side2 + Side3 <= Side1
        // not a triangle
        assertEquals(4, Tritype.Triang(6, 2, 3));
    }

    @Test
    public void testTritypeMCDC4() {
        // Side2 + Side3 <= Side1
        // triangle
        int actual = Tritype.Triang(5, 4, 3);
        assertEquals(1, actual);
    }

    @Test
    public void testTritypeMCDC5() {
        // Side1 + Side3 <= Side2
        // not a triangle
        assertEquals(4, Tritype.Triang(2, 5, 2));
    }

    @Test
    public void testTritypeMCDC6() {
        // Side1 + Side3 <= Side2
        // triangle
        assertEquals(1, Tritype.Triang(4, 5, 3));
    }
}
