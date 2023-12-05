package com.example.tritypejunittest;

import static org.junit.Assert.*;
import org.junit.Test;


public class TritypeLineBranchTest {
    @Test
    public void testTriang1() {
        // line1
        Tritype tri = new Tritype();
        assertEquals(1, tri.Triang(3, 4, 5));
    }

    @Test
    public void testTriang2() {
        // line2
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(-1, 2, 3));
    }

    @Test
    public void testTriang3() {
        // line3
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(0, 1, 2));
    }

    @Test
    public void testTriang4() {
        // line5
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(2, 2, 2));
    }

    @Test
    public void testTriang5() {
        // line6
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(2, 2, 2));
    }

    @Test
    public void testTriang6() {
        // line8
        Tritype tri = new Tritype();
        assertEquals(2, tri.Triang(2, 2, 3));
    }

    @Test
    public void testTriang7() {
        // line 9
        Tritype tri = new Tritype();
        assertEquals(2, tri.Triang(2, 2, 3));
    }

    @Test
    public void testTriang8() {
        // line11
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 4));
    }

    @Test
    public void testTriang9() {
        // line12
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 4));
    }

    @Test
    public void testTriang10() {
        //line 14
        Tritype tri = new Tritype();
        assertEquals(1, tri.Triang(3, 4, 5));
    }
}