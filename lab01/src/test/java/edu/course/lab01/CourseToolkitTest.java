package edu.course.lab01;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }
    
    @Test
    void returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);
        
        assertTrue(result);
    }

        // --- اختبارات دالة isPrime ---

    @Test
    void returnsFalseForNumberLessThanTwo() {
        assertFalse(CourseToolkit.isPrime(1));
        assertFalse(CourseToolkit.isPrime(-5));
    }

    @Test
    void returnsTrueForPrimeNumber() {
        assertTrue(CourseToolkit.isPrime(2));
        assertTrue(CourseToolkit.isPrime(13));
    }

    @Test
    void returnsFalseForCompositeNumber() {
        assertFalse(CourseToolkit.isPrime(4));
        assertFalse(CourseToolkit.isPrime(100));
    }

    @Test
    void returnsFalseForSquareOfPrime() {
        assertFalse(CourseToolkit.isPrime(49)); // 7 * 7
    }

    // --- اختبارات دالة isPalindrome ---

    @Test
    void returnsTrueForPalindrome() {
        assertTrue(CourseToolkit.isPalindrome("madam"));
        assertTrue(CourseToolkit.isPalindrome("level"));
    }

    @Test
    void returnsFalseForNonPalindrome() {
        assertFalse(CourseToolkit.isPalindrome("hello"));
    }

    @Test
    void throwsExceptionForNullPalindrome() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.isPalindrome(null));
    }

    // --- اختبارات دالة average ---

    @Test
    void returnsCorrectAverageForNormalArray() {
        int[] numbers = {10, 20, 30};
        assertEquals(20.0, CourseToolkit.average(numbers));
    }

    @Test
    void returnsCorrectAverageForNegativeNumbers() {
        int[] numbers = {-10, -20, -30};
        assertEquals(-20.0, CourseToolkit.average(numbers));
    }

    @Test
    void throwsExceptionForEmptyOrNullArray() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(null));
    }
}
