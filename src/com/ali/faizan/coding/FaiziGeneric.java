package com.ali.faizan.coding;

class FaiziGeneric<T> {

    /*
    * Generic Object
    * chohtha pathar
    * */
    private T mGenericObject;

    /*
    * No Argument Generic Constructor
    * tadke nal
    * */
    FaiziGeneric() {}

    /*
    * TYPE INFERENCE & GENERIC CONSTRUCTORS
    * one can make a generic constructor and pass anything like INTEGER, Employee, String and pass a parameterized
    * value of any type.
    *
    * e.g you can have String type of Class with the argument specified as boolean
    * new FaiziGeneric<String>(false) here String refers to T of FaiziGeneric<T> and false refers to <X>
    *
    * Aey Haji hun aevein krey sayen...
    * */
    @SuppressWarnings("unchecked")
    <E> FaiziGeneric(E element)
    {
        this.mGenericObject = (T) element;
    }

    void add(T mGenericParameterObject)
    {
        this.mGenericObject = mGenericParameterObject;
    }

    T get() {
        return mGenericObject;
    }

}