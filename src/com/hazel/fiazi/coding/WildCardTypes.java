package com.hazel.fiazi.coding;

import java.util.ArrayList;
import java.util.List;

class WildCardTypes
{
    static Double upperBoundWildCardAdd(ArrayList<? extends Number> numberList) {
        double sumDouble = 0.0;

        for(Number number: numberList)
            sumDouble += number.doubleValue();

        return sumDouble;
    }

    static void mBoundWildCardDisplay(List<?> anyList) {
        for(Object object: anyList)
            Main.printValues(object);
    }

    static void lowerBoundWildCardAdd(List<? super Integer> numberList) {
        for (Object object: numberList)
            Main.printValues(object);
    }
}
