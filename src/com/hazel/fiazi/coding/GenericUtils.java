package com.hazel.fiazi.coding;

class GenericUtils<T> implements Comparable<T> {

    static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] anyArray, T element) {
        int count = 0;
        for (T value: anyArray) {
            if (value.compareTo(element) > 0)
                ++count;
        }
        return count;
    }

    @Override
    public int compareTo(T number, boolean isHandle) {
        return 0;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
