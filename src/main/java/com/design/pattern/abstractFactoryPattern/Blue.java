package com.design.pattern.abstractFactoryPattern;

/**
 * Created by zmm on 2018/11/21
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
