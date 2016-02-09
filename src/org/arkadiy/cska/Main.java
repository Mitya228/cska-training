package org.arkadiy.cska;

import org.arkadiy.cska.sort.BubbleSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BubbleSort<Integer> integerBubbleSort = new BubbleSort<>();
        Integer[] array = {5, 1, 3, 7, 1337, 2};
        integerBubbleSort.sort(array);

        System.out.print(Arrays.toString(array));
    }
}
