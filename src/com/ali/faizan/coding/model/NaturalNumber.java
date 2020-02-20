package com.ali.faizan.coding.model;

/*
* a type parameter can have multiple bounds, if there is a class then it will come first.
* for example:
* Class A { anything  }
* interface B { anything }
* interface C { anything }
* class D <T extends A & B & C> { anything }
* If bound A is not specified first, you get a compile-time error:
* class D <T extends B & A & C> { anything }  // compile-time error
* */
public class NaturalNumber<N extends Integer>
{
    private N number;

    public NaturalNumber(N number) {
        this.number = number;
    }

    public boolean isEven() {
        return number.intValue() % 2 == 0;
    }

}
