package com.design.pattern.builderPattern;

/**
 * Created by zmm on 2018/11/21
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}