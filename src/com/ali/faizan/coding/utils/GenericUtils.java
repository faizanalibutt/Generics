package com.ali.faizan.coding.utils;

import com.ali.faizan.coding.app.FaiziGeneric;
import com.ali.faizan.coding.callback.Pair;
import com.ali.faizan.coding.model.Pairs;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class GenericUtils
{

    /**
     * GENERIC METHODS with a simple implementation to log anything you want to
     * here <M> is custom type of function or parameter that's came before return type, its a type parameter section
     * muje chorh doh rabia <3
     */
    public static <M> void printValues(M message) {
        System.out.println(message);
    }

    /*
    * Exploring Array Values and iterate through them
    * */
    public static <E> void printGenericArray(E[] elements)
    {
        for (E element : elements)
            GenericUtils.printValues(String.format("Generic Array Values Are: %s", element));
    }

    /**
    * GENERIC METHODS with multiple TYPE PARAMETERS
    * here we have type parameters in function you can make a class with multiple type parameters
    * for instance see this class {@link Pairs}
    * Apko maza aye ga bohut maza aye ga
    * */
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2)
    {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    /**
    * GENERIC BOUNDED TYPE + GENERIC METHODS
    * >-- basically just to comapre any object values with primitive data types.
    * <p>use a type parameter bounded by the Comparable<T> interface to fix primitive problem</p>
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
    public static <T> T pick(T a1, T a2) { return a2; }
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

    /**
     * @param instanceList to save list of E type
     * @param instance to instantiate any type of primitive or other
     * <pre>
     *       out of the java world things
     *       what do you think programming does have SPACE haha
     * </pre>
     * sarkari nokri ka koi faida nahe hi kharab ho jao gye. lmfao
     * */
    @SuppressWarnings("SameParameterValue")
    public static <E> void appendGenericValue(List<E> instanceList, Class<E> instance)
            throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        E elementInstance = instance.getDeclaredConstructor().newInstance();
        instanceList.add(elementInstance);
        printValues(String.format("Newly created instance is: %s", elementInstance));
    }

}
