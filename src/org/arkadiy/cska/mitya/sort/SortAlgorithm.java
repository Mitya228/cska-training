package org.arkadiy.cska.mitya.sort;

public interface SortAlgorithm<T extends Comparable<T>> {

    void sort(T[] array);
}
