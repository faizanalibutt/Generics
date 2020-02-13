package com.hazel.fiazi.coding;

import java.util.List;

class FaiziGeneric<T> {

    private T mGenericObject;

    void add(T mGenericParameterObject)
    {
        this.mGenericObject = mGenericParameterObject;
    }

    T get() {
        return mGenericObject;
    }

    <E> void printGenericArray(E[] elements)
    {
        for (E element : elements)
            GenericUtils.printValues(String.format("Generic Array Values Are: %s", element));
    }

    void drawShapes(List<? extends AbstractShape> shapeList)
    {
        for (AbstractShape shape : shapeList) {
            shape.draw();
        }
    }

}