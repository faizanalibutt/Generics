package com.ali.faizan.coding;

import java.util.ArrayList;
import java.util.List;

class WildCardUtils
{
    /*
     * if you are interested in knowing more about Comments you can start from here
     * ctrl click here at Integer {@link java.lang.Integer}
     * */

    /**
     * UPPER BOUND WILDCARD
     * <p>
     *     <? extends Foo> Here "?" is WildCard "extends" is keyword also "implements" is usable here "Foo" is Upper Bound
     * </p>
     * @param shapeList it is a list of types from Upper Bound
     * kuri menu kehndi neeche daikho >V<
     * */
    static void simpleWildCarDrawShapes(List<? extends AbstractShape> shapeList)
    {
        for (AbstractShape shape : shapeList) {
            shape.draw();
        }
    }
    /**
     * same as above with some exceptions see code you will get it.
     * @param numberList list provided of any Number type like Integer, Float, Long, Short, Byte
     * @return it will return value in double format/type
     */
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

    /**
     * WILDCARD CAPTURE
     * @param listInfo this list object is used to capture wildcard
     * Sub badhe jan gye :D
     * */
    static void wildCardCaptureFoo(List<?> listInfo) {
        fooHelper(listInfo);
    }

    /**
     * if you run this statement directly it will get error work around is like this function for this code
     * listInfo.set(0, listInfo.get(0));
     * */
    static <T> void fooHelper(List<T> listInfo) {
        listInfo.set(0, listInfo.get(0));
    }

}