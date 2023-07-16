package test.java.com.dsa.book.chpt_two;

import main.java.com.dsa.book.chpt_two.Search;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SearchTest {
    Search search = new Search();


    @Test
    @DisplayName("Search for non existing value")
    public void binarySearch(){
        // Given
        int[] numList = {1, 3, 5, 7, 9, 9};
        int result = search.binarySearch(numList, 2);
        assertEquals(-1, result, "Value should not be found");

        result = search.binarySearch(numList, 7);
        assertEquals(3, result, "9 should be found at index 4");
    }

}