package com.design.pattern.interceptingPattern;

/**
 * Created by zmm on 2018/12/14
 */
public class DebugFilter implements Filter {

    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
