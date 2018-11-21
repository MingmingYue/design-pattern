package com.design.pattern.abstractFactoryPattern;

/**
 * Created by zmm on 2018/11/21
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
