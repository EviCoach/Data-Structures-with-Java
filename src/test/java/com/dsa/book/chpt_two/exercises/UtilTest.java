package test.java.com.dsa.book.chpt_two.exercises;

import main.java.com.dsa.book.chpt_two.exercises.Util;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {
    Util util;

    @BeforeEach
    public void setUp() {
        util = new Util();
    }

    @Test
    @DisplayName(value = "Test if an empty array is sorted")
    public void sortEmptyArray(){
        int[] arr = {};
        boolean result = util.isSorted(arr);
        assertTrue(result);
    }

    @Test
    @DisplayName("Array is not sorted")
    void isSorted() {
        int arr[] = {1, 0, 3, 1, 2, 0, 0};
        boolean result = util.isSorted(arr);
        assertFalse(result);
    }

    @Test
    @DisplayName("Array is sorted")
    void testSortedArray() {
        int arr[] = {1, 1, 3, 5, 6, 8, 11};
        boolean result = util.isSorted(arr);
        assertTrue(result);
    }
}