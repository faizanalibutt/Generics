package com.ali.faizan.coding.model;


import com.ali.faizan.coding.app.FaiziGeneric;

public class TypeErasure extends FaiziGeneric<Integer>
{

    /**
     * just to show how one can define value in child and get function from parent like add()
     * @param intDataValue this is what will be initialized real work will be in parent class
     * */
    public TypeErasure(Integer intDataValue)
    {
        super(intDataValue);
    }

    public void add(Integer intDataValue)
    {
        System.out.println("TypeErause.add");
        super.add(intDataValue);
    }

}
