package org.arkadiy.cska.sort;

public interface SortAlgorithm<T extends Comparable<T>> {

    void sort(T[] array);
}
