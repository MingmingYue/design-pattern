package com.design.pattern.prototypePattern;

/**
 * Created by zmm on 2018/12/7
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}