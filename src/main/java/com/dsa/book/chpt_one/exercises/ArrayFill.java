package main.java.com.dsa.book.chpt_one.exercises;

import java.util.Arrays;
import java.util.Date;

public class ArrayFill {
    public static void main(String[] args) {
        Object[] everything = new Object[5];

        Arrays.fill(everything, new Date());
        System.out.println("Filled array");
        print(everything);
        Arrays.fill(everything, 22);
        print(everything);
        Arrays.fill(everything, "Yo!");
        print(everything);
    }

    public static <T> void print(T[] values) {
        System.out.print("{ ");

        for (int i = 0; i < values.length; i++) {
            T current = values[i];


            if (i != values.length - 1) {
                System.out.print(current + ",");
                continue;
            }
            System.out.print(current);
            break;

        }

        System.out.print(" }\n");
    }
}
