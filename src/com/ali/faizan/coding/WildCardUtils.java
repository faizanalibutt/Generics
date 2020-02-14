package com.ali.faizan.coding;

import java.util.ArrayList;
import java.util.List;

class WildCardUtils
{
    static void sipleWildcardrawShapes(List<? extends AbstractShape> shapeList)
    {
        for (AbstractShape shape : shapeList) {
            shape.draw();
        }
    }

    static Double upperBoundWildCardAdd(ArrayList<? extends Number> numberList)
    {
        double sumDouble = 0.0;

        for (Number number : numberList)
            sumDouble += number.doubleValue();

        return sumDouble;
    }

    static void mBoundWildCardDisplay(List<?> anyList)
    {
        for (Object object : anyList)
            GenericUtils.printValues(object);
    }

    static void lowerBoundWildCardAdd(List<? super Integer> numberList)
    {
        for (Object object : numberList)
            GenericUtils.printValues(object);
    }
}
