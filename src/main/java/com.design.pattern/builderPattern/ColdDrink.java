package com.design.pattern.builderPattern;

/**
 * Created by zmm on 2018/11/21
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
