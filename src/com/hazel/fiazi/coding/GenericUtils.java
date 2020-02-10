package com.hazel.fiazi.coding;

class GenericUtils {

    static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    public static <N extends Comparable<N>> N countinGreaterThan(N[] anyArray, N element) {

        N object = null;

        for (N value: anyArray) {
            /*if(value.CompareTo(element) > )
                return object;*/
        }

        return null;

    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] anyArray, T element) {
        int count = 0;
        for (T value: anyArray) {
            if (value.compareTo(element) > 0)
                ++count;
        }
        return count;
    }

}