package main.java.com.dsa.book.chpt_two;

public class Search {
    public int binarySearch(int[] arr, int x){
        // POST CONDITIONS: returns i;
        int lo = 0;
        int hi = arr.length;

        while(lo < hi){
            int i = (lo + hi)/2;
            if(arr[i] == x){
                return i;
            } else if(arr[i] < x){
                lo = i + 1;
            } else {
                hi = i;
            }
        }
        return -1;
    }
}
