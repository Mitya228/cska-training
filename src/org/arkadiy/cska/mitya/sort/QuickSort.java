package org.arkadiy.cska.mitya.sort;

/**
 * Created by Mitya on 12.02.2016.
 */
public class QuickSort<T extends Comparable<T>> implements SortAlgorithm<T> {

    @Override
    public void sort(T[] array) {
        int left = 0;
        int right = array.length-1;
        quickSort(array,left,right);
    }

    private int partition(T[] array, int left, int right)
    {
        int i = left, j = right;
        T tmp;
        T pivot = array[(left+right)/2];

        while (i <= j) {
            while (array[i].compareTo(pivot) < 0)
                i++;
            while (array[j].compareTo(pivot) > 0)
                j--;
            if (i <= j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }

    private void quickSort(T[] array, int left, int right) {
        int index = partition(array, left, right);
        if (left < index - 1)
            quickSort(array, left, index - 1);
        if (index < right)
            quickSort(array, index, right);
    }
}
