package org.arkadiy.cska.sort;

public class BubbleSort<T extends Comparable<T>> implements SortAlgorithm<T> {

    @Override
    public void sort(T[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    private static <V> void swap(V[] array, int index1, int index2) {
        V tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
