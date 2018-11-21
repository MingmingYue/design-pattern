package com.design.pattern.builderPattern;

/**
 * Created by zmm on 2018/11/21
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}