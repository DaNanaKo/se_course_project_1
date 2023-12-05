package com.example.tritypejunittest;


import static org.junit.Assert.*;

import org.junit.Test;
public class TritypeMutantTwoTest {
    @Test
    public void killTritypeMutantTwo() {
        // kill the mutant TritypeMutantTwo.java for the condition i == j && j == k to i == j || j == k
        assertNotEquals(2, TritypeMutantTwo.Triang(2, 3, 3)); // return 3 (equilateral) instead of 2
    }

}