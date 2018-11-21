package com.design.pattern.abstractFactoryPattern;

/**
 * Created by zmm on 2018/11/21
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
