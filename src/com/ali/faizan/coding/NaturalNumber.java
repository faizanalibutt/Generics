package com.ali.faizan.coding;

class NaturalNumber<N extends Integer>
{
    private N number;

    NaturalNumber(N number) {
        this.number = number;
    }

    boolean isEven() {
        return number.intValue() % 2 == 0;
    }

}
