package com.design.pattern.abstractFactoryPattern;

/**
 * Created by zmm on 2018/11/21
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
