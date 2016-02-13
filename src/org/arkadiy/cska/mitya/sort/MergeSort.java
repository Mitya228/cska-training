package org.arkadiy.cska.mitya.sort;

/**
 * Created by Mitya on 12.02.2016.
 */
public class MergeSort<T extends Comparable<T>> implements SortAlgorithm<T> {


    public void print(T[] array) {
        for (int l =0; l<array.length;l++){
            System.out.print(array[l]);
        }
        System.out.println();
    }
    @Override
    public void sort(T[] array) {
        int left = 0;
        int right = array.length-1;
        mergeSort(array,left,right);
    }

    private T[] mergeSort(T[] array, int left, int right) {
        print(array);
        if ((right-left) <= 1) return array;
        int middle = (right-left) / 2;
        mergeSort(array,left,middle);
        mergeSort(array,middle+1,right);
        merge(array,left,right,middle);
        return array;
    }

    private T[] merge(T[] array, int left, int right, int middle) {
        T [] helper = (T[]) new Comparable[middle-left+1];
        int i,j,k;
        for(i=0;i<(middle-left+1);i++) {
            helper[i] = array[left + i];
        }
        i = 0;
        j = left;
        k = middle+1;
        while(i<=middle && j<=right) {
            if (array[k].compareTo(helper[i]) <= 0) {
                array[j] = array[k];
                k++;
            }
            else {
                array[j] = helper[i];
                i++;
            }
            j++;
        }
        while (i<= middle) {
            array[j] = helper[i];
            i++;
            j++;
        }
        return array;

    }
}
