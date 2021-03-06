package com.ali.faizan.coding;

import com.ali.faizan.coding.app.FaiziGeneric;
import com.ali.faizan.coding.callback.Pair;
import com.ali.faizan.coding.model.*;
import com.ali.faizan.coding.utils.GenericUtils;
import com.ali.faizan.coding.utils.WildCardUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.ali.faizan.coding.utils.GenericUtils.printValues;

public class Main
{

    public static void main(String[] args)
    {

        printValues("\n\n>>>>>>>>>>>>GENERICS<<<<<<<<<<<<<\n\n");
        printValues("Generics add stability to your code by making more of your bugs detectable at compile time.");

        FaiziGeneric<Integer> faiziGeneric = new FaiziGeneric<>();

        printValues("\nApplying generics to INT\n");
        faiziGeneric.add(3);
        printValues(faiziGeneric.get());
        faiziGeneric.add(23);
        printValues(faiziGeneric.get());
        Integer[] integersArray = {10, 20, 30, 40, 50};
        GenericUtils.printGenericArray(integersArray);

        printValues("\nApplying generics to CHARACTER\n");
        Character[] charactersArray = {'Y', 'F', 'A', 'S', 'I', 'R', 'Z', 'N'};
        GenericUtils.printGenericArray(charactersArray);

        printValues("\n>>>>>>>>>>>>Multiple Type Parameters<<<<<<<<<<<<<\n");

        Pair<String, Integer> pair1 = new Pairs<>("Faizi", 23);
        Pair<String, Integer> pair2 = new Pairs<>("Uzi", 1);
        printValues(String.format("Pair1 Information is: Value: %s, Key: %d", pair1.getKey(), pair1.getValue()));
        printValues(String.format("Pair2 Information is: Value: %s, Key: %d", pair2.getKey(), pair2.getValue()));
        boolean same = GenericUtils.<String, Integer>compare(pair1, pair2); /*its understood but sometimes it isn't while dealing with legacy code*/
        boolean adjacent = GenericUtils.compare(pair1, pair2);
        printValues(String.format(" 'Parametrized TYPES INFERRING' Generic Compare Value is: %s", adjacent));
        Pairs<String, FaiziGeneric<Integer>> orderedPair = new Pairs<>("MyGeneric", faiziGeneric);
        printValues(String.format("MyGeneric Parameter Information is: Value: %s, Key: %s", orderedPair.getKey(), orderedPair.getValue()));

        printValues("\n>>>>>>>>>>>>Bounded Type Parameters<<<<<<<<<<<<<\n");

        NaturalNumber<Integer> naturalNumber = new NaturalNumber<>(22);
        boolean isEven = naturalNumber.isEven();
        printValues(String.format("Check Number isEven: %s", isEven));

        printValues("\n>>>>>>>>>>>>Generic Methods & Bounded Type Parameters<<<<<<<<<<<<<\n");

        int value = GenericUtils.countGreaterThan(integersArray, 40);
        printValues(String.format("Check given Number isGreater: %s", value));

        printValues("\n\n>>>>>>>>>>>>TYPE INFERENCE<<<<<<<<<<<<<\n");

        printValues("\n>>>>>>>>>>>>TYPE INFERENCE & GENERIC METHODS, GENERIC CLASSES<<<<<<<<<<<<<\n");
        List<FaiziGeneric<Integer>> integerBoxesList = new ArrayList<>(); // btw you can use ArrayList if you want to or LinkedList
        GenericUtils.addBox(10, integerBoxesList);
        GenericUtils.addBox(20, integerBoxesList);
        // you can specify the type but JVM infers auto what type of argument is.
        GenericUtils.<Integer>addBox(100, integerBoxesList);
        GenericUtils.outPutBoxex(integerBoxesList);

        printValues("\n\n>>>>>>>>>>>>Wildcard Entering BIG >- SHOW<<<<<<<<<<<<<\n");

        printValues("\n>>>>>>>>>>>>Simple Wildcard<<<<<<<<<<<<<\n");
        List<Rectangle> rectangleList = new ArrayList<>();
        rectangleList.add(new Rectangle());
        WildCardUtils.simpleWildCarDrawShapes(rectangleList);
        List<Circle> circleList = new ArrayList<>();
        circleList.add(new Circle());
        WildCardUtils.simpleWildCarDrawShapes(circleList);

        // homework make 2 one of hashmap generated second simple lists of char integer double float

        printValues("\n>>>>>>>>>>>>Upper Bound WildCard WildCard<<<<<<<<<<<<<\n");

        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(10.0);
        doubleList.add(20.0);
        printValues(String.format("displaying sum of doubleList: %s", WildCardUtils.upperBoundWildCardAdd(doubleList)));

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        printValues(String.format("displaying sum of doubleList after converting: %s", WildCardUtils.upperBoundWildCardAdd(integerList)));

        printValues("\n>>>>>>>>>>>>UnBound WildCard<<<<<<<<<<<<<\n");

        List<Integer> intList = Arrays.asList(1,2,3);
        printValues("Displaying the Integer Values");
        WildCardUtils.mUnBoundWildCardDisplay(intList);

        List<String> stringList = Arrays.asList("one", "two", "three");
        printValues("Displaying the String Values");
        WildCardUtils.mUnBoundWildCardDisplay(stringList);

        printValues("\n>>>>>>>>>>>>Lower Bound WildCard<<<<<<<<<<<<<\n");

        printValues("Displaying the Integer Values");
        WildCardUtils.lowerBoundWildCardAdd(intList);

        List<Number> numberList = Arrays.asList(1.0, 2.0, 3.0);
        printValues("Displaying The Number Values of Double type");
        WildCardUtils.lowerBoundWildCardAdd(numberList);

        printValues("\n\n>>>>>>>>>>>>TYPE ENSURE<<<<<<<<<<<<<\n");

        FaiziGeneric<Integer> typeErasure = new TypeErasure(23);
        printValues(String.format("Type Erasure Value is: %s", typeErasure.get()));

        printValues("\n\n>>>>>>>>>>>>RESTRICTIONS ON GENERICS<<<<<<<<<<<<<\n");

        printValues("\n>>>>>>>>>>>>Instance of Type Parameter<<<<<<<<<<<<<\n");

        try
        {
            List<String> restrictedStringList = new ArrayList<>();
            GenericUtils.appendGenericValue(restrictedStringList, String.class);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e)
        /*you can use simple Exception Root of exceptions here btw*/
        {
            e.printStackTrace();
        }

        /*
         * see here {@link https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html}
         * */
        printValues("FOR COMPLETE SENSE ON HOW RESTRICTIONS WORK SEE DOCS");

    }

}
