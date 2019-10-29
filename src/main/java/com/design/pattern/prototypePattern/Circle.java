package com.design.pattern.prototypePattern;

/**
 * Created by zmm on 2018/12/7
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
