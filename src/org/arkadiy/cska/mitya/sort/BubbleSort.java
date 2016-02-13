package org.arkadiy.cska.mitya.sort;

public class BubbleSort<T extends Comparable<T>> implements SortAlgorithm<T> {

    @Override
    public void sort(T[] array) {
       boolean changed = false;
        int counter = 1;
        do {
            changed = false;
            for (int i = 0; i < array.length - counter; i++) {
                if (array[i].compareTo((array[i+1])) > 0) {
                    T t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                    changed = true;
                }
            }
            counter++;
        } while(changed);
    }
}
