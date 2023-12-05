package com.example.tritypejunittest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TritypeDecisionTest {

    @Test
    public void testTritypeDecision1() {
        // Side1 + Side2 <= Side3 || Side2 + Side3 <= Side1 || Side1 + Side3 <= Side2
        // not a triangle
        assertEquals(4, Tritype.Triang(1, 2, 4));
    }

    @Test
    public void testTritypeDecision2() {
        // Side1 + Side2 > Side3 && Side2 + Side3 > Side1 && Side1 + Side3 > Side2
        // triangle
        assertEquals(1, Tritype.Triang(3, 4, 5));
    }
}
