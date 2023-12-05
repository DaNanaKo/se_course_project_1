package com.example.tritypejunittest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TritypeConditionTest {

    @Test
    public void testTritypeCondition1() {
        // Side1 + Side2 <= Side3
        assertEquals(4, Tritype.Triang(1, 2, 4));
    }

    @Test
    public void testTritypeCondition2() {
        // Side1 + Side2 > Side3
        assertEquals(1, Tritype.Triang(3, 4, 5));
    }

    @Test
    public void testTritypeCondition3() {
        // Side2 + Side3 <= Side1
        assertEquals(4, Tritype.Triang(6, 2, 3));
    }

    @Test
    public void testTritypeCondition4() {
        // Side2 + Side3 > Side1
        assertEquals(1, Tritype.Triang(5, 4, 3));
    }

    @Test
    public void testTritypeCondition5() {
        // Side1 + Side3 <= Side2
        assertEquals(4, Tritype.Triang(2, 5, 2));
    }

    @Test
    public void testTritypeCondition6() {
        // Side1 + Side3 > Side2
        assertEquals(1, Tritype.Triang(4, 5, 3));
    }
}
