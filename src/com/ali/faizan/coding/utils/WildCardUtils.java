package com.ali.faizan.coding.utils;

import com.ali.faizan.coding.app.AbstractShape;

import java.util.ArrayList;
import java.util.List;

public class WildCardUtils
{
    /**
     * if you are interested in knowing more about Comments you can start from here
     * ctrl click here at Integer {@link java.lang.Integer}
     *
     * UPPER BOUND WILDCARD
     * <p>
     *     <? extends Foo> Here "?" is UNKNOWN WildCard "extends" is keyword also "implements" is usable here
     *                     "Foo" is Upper Bound
     *     <? super T> Here "?" is UNKNOWN TYPE OF WILDCARD "super" denotes Parent, Base, Master class here
     *                 "T" Lower Bound of T type (T could be anything Person, Human, Object, Foo)
     * </p>
     * @param shapeList it is a list of types from Upper Bound
     * kuri menu kehndi neeche daikho >V<
     * */
    public static void simpleWildCarDrawShapes(List<? extends AbstractShape> shapeList)
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
    public static Double upperBoundWildCardAdd(ArrayList<? extends Number> numberList)
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
    public static void mUnBoundWildCardDisplay(List<?> anyList)
    {
        for (Object object : anyList)
            GenericUtils.printValues(object);
    }

    /**
     * LOWER BOUNDED WILDCARD
     * <p>
     *     <? super T> Here "?" is UNKNOWN TYPE OF WILDCARD "super" denotes Parent, Base, Master class here
     *                 "T" Lower Bound of T type (T could be anything Person, Human, Object, Foo)
     * </p>
     * @param numberList one can iterate through Integers list also super types of it like Number, Object
     * upper daikho >^<
     * */
    public static void lowerBoundWildCardAdd(List<? super Integer> numberList)
    {
        for (Object object : numberList)
            GenericUtils.printValues(object);
    }

    /**
     * WILDCARD CAPTURE
     * @param listInfo this list object is used to capture wildcard
     * Sub badhe jan gye :D
     * */
    public static void wildCardCaptureFoo(List<?> listInfo) {
        fooHelper(listInfo);
    }

    /**
     * if you run this statement directly it will get error work around is like this function for this code
     * listInfo.set(0, listInfo.get(0));
     * lakar dah sohthah grees alah
     * */
    static <T> void fooHelper(List<T> listInfo) {
        listInfo.set(0, listInfo.get(0));
    }

}