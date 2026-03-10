package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    // Method to test grade calculation
    @Test
    public void testGradeA() {
        char grade = App.calculateGrade(95);
        assertEquals('A', grade);
    }
}