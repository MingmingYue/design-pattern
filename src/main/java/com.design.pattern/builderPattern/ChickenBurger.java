package com.design.pattern.builderPattern;

/**
 * Created by zmm on 2018/11/21
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
