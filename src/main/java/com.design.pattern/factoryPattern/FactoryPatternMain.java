package com.design.pattern.factoryPattern;

/**
 * Created by zmm on 2018/11/20
 */
public class FactoryPatternMain {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
    }
}
