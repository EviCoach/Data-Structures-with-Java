package main.java.com.dsa.book.chpt_three;

public class InsertImpl {

    public void insert(int[] a, int n, int x) {
        // preconditions: a[0] <= ... <= a[n-1], and n < a.length;
        // postconditions: a[0] <= ... <= a[n], and x is among them;

        int i = 0;
        while (i < n && a[i] <= x) {
            ++i;
        }

        System.arraycopy(a, i, a, i + 1, n - 1);
    }
}
