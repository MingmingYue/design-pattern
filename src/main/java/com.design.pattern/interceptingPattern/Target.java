package com.design.pattern.interceptingPattern;

/**
 * Created by zmm on 2018/12/14
 */
public class Target {

    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
