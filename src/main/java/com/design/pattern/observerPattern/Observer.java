package com.design.pattern.observerPattern;

/**
 * Created by zmm on 2018/12/11
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}
