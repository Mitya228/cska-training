package org.arkadiy.cska.mitya.sort;

/**
 * Created by Mitya on 12.02.2016.
 */
public class InsertionSort<T extends Comparable<T>> implements SortAlgorithm<T> {


    @Override
    public void sort(T[] array) {
        for (int i = 1; i < array.length;i++) {
            T value = array[i];
            int j = i - 1;
            while (j>=0 && (array[j].compareTo(value) > 0)) {
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = value;
        }

    }
}
