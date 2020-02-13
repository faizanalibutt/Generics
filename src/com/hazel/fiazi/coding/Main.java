package com.hazel.fiazi.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyGeneric<Integer> myGeneric = new MyGeneric<>();

        printValues("\nApplying generics to INT\n");

        myGeneric.add(3);
        printValues(myGeneric.get());
        myGeneric.add(23);
        printValues(myGeneric.get());
        Integer[] integersArray = {10, 20, 30, 40, 50};
        myGeneric.printGenericArray(integersArray);

        printValues("\nApplying generics to CHARACTER\n");
        Character[] charactersArray = {'Y', 'F', 'A', 'S', 'I', 'R', 'Z', 'N'};
        myGeneric.printGenericArray(charactersArray);

        printValues("\nMultiple Type Parameters\n");

        Pair<String, Integer> pair1 = new Pairs<>("Faizi", 23);
        Pair<String, Integer> pair2 = new Pairs<>("Uzi", 1);
        printValues(String.format("Pair1 Information is: Value: %s, Key: %d", pair1.getKey(), pair1.getValue()));
        printValues(String.format("Pair2 Information is: Value: %s, Key: %d", pair2.getKey(), pair2.getValue()));
        boolean same = GenericUtils.<String, Integer>compare(pair1, pair2); /*its understood but sometimes it isn't while dealing with legacy code*/
        boolean adjacent = GenericUtils.compare(pair1, pair2);
        printValues(String.format("Generic Compare Value is: %s", adjacent));
        Pairs<String, MyGeneric<Integer>> orderedPair = new Pairs<>("MyGeneric", myGeneric);
        printValues(String.format("MyGeneric Parameter Information is: Value: %s, Key: %s", orderedPair.getKey(), orderedPair.getValue()));

        printValues("\n>>>>>>>>>>>>Bounded Type Parameters<<<<<<<<<<<<<\n");

        NaturalNumber<Integer> naturalNumber = new NaturalNumber<>(22);
        boolean isEven = naturalNumber.isEven();
        printValues(String.format("Check Number isEven: %s", isEven));

        printValues("\n>>>>>>>>>>>>Generic Methods & Bounded Type Parameters<<<<<<<<<<<<<\n");

        int value = GenericUtils.countGreaterThan(integersArray, 60);
        printValues(String.format("Check given Number isGreater: %s", value));

        printValues("\n>>>>>>>>>>>>Wildcard Entering<<<<<<<<<<<<<\n");

        printValues("\nSimple WildCard\n");
        List<Rectangle> rectangleList = new ArrayList<>();
        rectangleList.add(new Rectangle());
        myGeneric.drawShapes(rectangleList);
        List<Circle> circleList = new ArrayList<>();
        circleList.add(new Circle());
        myGeneric.drawShapes(circleList);

        // homework make 2 one of hashmap generated second simple lists of char integer double float

        printValues("\nUpper Bound WildCard WildCard\n");

        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(10.0);
        doubleList.add(20.0);
        printValues(String.format("displaying sum of doubleList: %s", WildCardTypes.upperBoundWildCardAdd(doubleList)));

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        printValues(String.format("displaying sum of doubleList after converting: %s", WildCardTypes.upperBoundWildCardAdd(integerList)));

        printValues("\nBound WildCard\n");

        List<Integer> intList = Arrays.asList(1,2,3);
        printValues("Displaying the Integer Values");
        WildCardTypes.mBoundWildCardDisplay(intList);

        List<String> stringList = Arrays.asList("one", "two", "three");
        printValues("Displaying the String Values");
        WildCardTypes.mBoundWildCardDisplay(stringList);

        printValues("\nLower Bound WildCard\n");

        printValues("Displaying the Integer Values");
        WildCardTypes.lowerBoundWildCardAdd(intList);

        List<Number> numberList = Arrays.asList(1.0, 2.0, 3.0);
        printValues("Displaying The Number Values");
        WildCardTypes.lowerBoundWildCardAdd(numberList);

    }

    static <E> void printValues(E message) {
        System.out.println(message);
    }

}
