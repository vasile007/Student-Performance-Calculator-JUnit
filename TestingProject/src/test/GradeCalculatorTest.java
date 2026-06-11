package test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for GradeCalculator.
 */
public class GradeCalculatorTest {

    @Test
    public void testGradeA() {
        GradeCalculator gc = new GradeCalculator();
        assertEquals(10, gc.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        GradeCalculator gc = new GradeCalculator();
        assertEquals(9, gc.calculateGrade(85));
    }

    @Test
    public void testGradeC() {
        GradeCalculator gc = new GradeCalculator();
        assertEquals(8, gc.calculateGrade(75));
    }

    @Test
    public void testGradeBelow50() {
        GradeCalculator gc = new GradeCalculator();
        assertEquals(5, gc.calculateGrade(20));
    }
}