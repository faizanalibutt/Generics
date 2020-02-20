package com.ali.faizan.coding.model;

import com.ali.faizan.coding.app.AbstractShape;
import com.ali.faizan.coding.utils.GenericUtils;

public class Rectangle extends AbstractShape {
    @Override
    public void draw() {
        GenericUtils.printValues("Rectangle is drawn");
    }
}
