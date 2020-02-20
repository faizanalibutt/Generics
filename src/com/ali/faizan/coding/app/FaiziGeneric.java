package com.ali.faizan.coding.app;

/**
 * @param <T> the type of the value being Used/Boxed
 * */
public class FaiziGeneric<T>
{

    /*
    * Generic Object
    * T stands for "Type"
    * chohtha pathar
    * */
    private T mGenericObject;

    /*
    * No Argument Generic Constructor
    * tadke nal
    * */
    public FaiziGeneric() {}

    /*
    * TYPE INFERENCE & GENERIC CONSTRUCTORS
    * one can make a generic constructor and pass anything like INTEGER, Employee, String and pass a parameterized
    * value of any type.
    *
    * e.g you can have String type of Class with the argument specified as boolean
    * new FaiziGeneric<String>(false) here String refers to T of FaiziGeneric<T> and false refers to <X>
    *
    * Aey HAJI hun aevein krey sayen...
    * */
    @SuppressWarnings("unchecked")
    public <E> FaiziGeneric(E element)
    {
        this.mGenericObject = (T) element;
    }

    public void add(T mGenericParameterObject)
    {
        this.mGenericObject = mGenericParameterObject;
    }

    public T get() {
        return mGenericObject;
    }

}