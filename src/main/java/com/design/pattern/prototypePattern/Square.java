package com.design.pattern.prototypePattern;

/**
 * Created by zmm on 2018/12/7
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
