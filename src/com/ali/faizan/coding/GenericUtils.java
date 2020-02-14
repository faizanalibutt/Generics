package com.ali.faizan.coding;

import java.io.Serializable;
import java.util.ArrayList;

class GenericUtils<T> {

    /**
     * GENERIC METHODS with a simple implementation to log anything you want to
     * here <M> is custom type of function or parameter that's came before return type
     * muje chorh doh rabia <3
     */
    static <M> void printValues(M message) {
        System.out.println(message);
    }

    /*
    * Exploring Array Values and iterate through them
    * */
    static <E> void printGenericArray(E[] elements)
    {
        for (E element : elements)
            GenericUtils.printValues(String.format("Generic Array Values Are: %s", element));
    }

    /*
    * GENERIC METHODS with multiple TYPE PARAMETERS
    * Apko maza aye ga bohut maza aye ga
    * */
    static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2)
    {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    /*
    * GENERIC BOUNDED TYPE + GENERIC METHODS
    * >-- basically just to comapre any values with primitive data types.
    * gabrana nahe hi :D
    * */
    public static <T extends Comparable<T>> int countGreaterThan(T[] anyArray, T element)
    {
        int count = 0;
        for (T value: anyArray) {
            if (value.compareTo(element) > 0)
                ++count;
        }
        return count;
    }

    /*
    * TYPE INFERENCE keep it simple. its just an ALGORITHM that tells which type you are going to specify closest one.
    * kia karun cherh gye hi :P
    * */
    static <T> T pick(T a1, T a2) { return a2; }
    Serializable s = pick("d", new ArrayList<String>());
    Serializable s1 = pick("s", new ArrayList<Integer>());

    /*
    * TYPE INFERENCE AND GENERIC METHODS
    * Type inference is going to set things in a list.
    * Teeka lag gia hi. bhai :(
    * */
    public static <T> void addBox(T t, java.util.List<FaiziGeneric<T>> boxesList)
    {
        FaiziGeneric<T> boxObj = new FaiziGeneric<>();
        boxObj.add(t);
        boxesList.add(boxObj);
    }
    /* to be continued... >V<
    * loop through things added.
    * hoorein nazer arahe hain
    *  */
    public static <T> void outPutBoxex(java.util.List<FaiziGeneric<T>> outputBoxesList)
    {
        int counterValue = 0;
        for (FaiziGeneric<T> value: outputBoxesList) {
            T boxContents = value.get();
            System.out.println(String.format("Box #: %s contains [%s]", counterValue, boxContents));
            counterValue+=1;
        }
    }

}
