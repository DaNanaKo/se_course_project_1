package com.example.tritypejunittest;


import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutantOneTest {
    @Test
    public void killTritypeMutantOne() {
        // kill the mutant TritypeMutantOne.java for the condition i+j > k to i+j >= k
        assertNotEquals(4, TritypeMutantOne.Triang(1, 2, 3)); // return 3 (scalene) instead of 4
    }
}