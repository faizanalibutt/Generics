package com.hazel.fiazi.coding;

import java.util.List;

import static com.hazel.fiazi.coding.Main.printValues;

class MyGeneric<T> {

        private T mGenericObject;

        void add(T mGenericParameterObject) {
            this.mGenericObject = mGenericParameterObject;
        }

        T get() {
            return mGenericObject;
        }

        <E> void printGenericArray(E[] elements) {
            for (E element: elements)
                printValues(String.format("Generic Array Values Are: %s", element));
        }

        void drawShapes(List<? extends AbstractShape> shapeList) {
            for(AbstractShape shape: shapeList) {
                shape.draw();
            }
        }

    }