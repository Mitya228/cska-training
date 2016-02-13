package org.arkadiy.cska;

import org.arkadiy.cska.mitya.sort.MergeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        InsertionSort<Integer> integerBubbleSort = new InsertionSort<>();
//        QuickSort<Integer> integerQuickSort = new QuickSort<>();
        MergeSort<Integer> integerMergeSort = new MergeSort<>();
        Integer[] array = {9, 0, 5, 3,2,7,1,6,4};
//        integerBubbleSort.sort(array);
//        integerQuickSort.sort(array);
        integerMergeSort.sort(array);

        System.out.print(Arrays.toString(array));
    }
}
