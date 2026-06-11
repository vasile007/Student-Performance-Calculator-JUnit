package test;

/**
 * GradeCalculator converts a numeric score into a grade value.
 */
public class GradeCalculator {

    public int calculateGrade(int score) {


        if (score >= 90) return 10;
        if (score >= 80) return 9;
        if (score >= 70) return 8;
        if (score >= 60) return 7;
        if (score >= 50) return 6;
        return 5;
    }
}
