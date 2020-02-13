package com.hazel.fiazi.coding;

interface Comparable<T> extends java.lang.Comparable<T> {
    //T CompareToDo(T number);
    int compareTo(T number, boolean isHandle);
}
