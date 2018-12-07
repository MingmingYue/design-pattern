package com.design.pattern.bridgePattern;

/**
 * Created by zmm on 2018/12/7
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
