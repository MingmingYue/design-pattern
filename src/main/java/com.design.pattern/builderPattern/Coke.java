package com.design.pattern.builderPattern;

/**
 * Created by zmm on 2018/11/21
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}