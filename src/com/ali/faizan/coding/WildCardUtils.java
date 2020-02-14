package com.ali.faizan.coding;

import java.util.ArrayList;
import java.util.List;

class WildCardUtils
{
    /**
     * UPPER BOUND WILDCARD
     * <p>
     *     <? extends Foo> Here "?" is WildCard "extends" is key also "implements" is usable here "Foo" is Upper Bound
     * </p>
     * @param shapeList it is a list of types from Upper Bound
     * kuri menu kehndi
     * neeche daikho >V<
     * */
    static void sipleWildcardrawShapes(List<? extends AbstractShape> shapeList)
    {
        for (AbstractShape shape : shapeList) {
            shape.draw();
        }
    }
    /*same as above with some exceptions see code you will get it.*/
    static Double upperBoundWildCardAdd(ArrayList<? extends Number> numberList)
    {
        double sumDouble = 0.0;

        for (Number number : numberList)
            sumDouble += number.doubleValue();

        return sumDouble;
    }

    /**
     * UNBOUNDED WILDCARD (?)
     * @param anyList iterate through any kind of list using this var
     * Nah andhro nah bahron main lutti gye vich karon
     * PEECHE DAIKHO PEECHE
     * */
    static void mUnBoundWildCardDisplay(List<?> anyList)
    {
        for (Object object : anyList)
            GenericUtils.printValues(object);
    }

    /**
     * LOWER BOUNDED WILDCARD
     * @param numberList one can iterate through Integers list also super types of it like Number, Object
     * upper daikho >^<
     * */
    static void lowerBoundWildCardAdd(List<? super Integer> numberList)
    {
        for (Object object : numberList)
            GenericUtils.printValues(object);
    }
}
