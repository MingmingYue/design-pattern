package com.design.pattern.builderPattern;

/**
 * Created by zmm on 2018/11/21
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
