package com.design.pattern.abstractFactoryPattern;

/**
 * Created by zmm on 2018/11/21
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
