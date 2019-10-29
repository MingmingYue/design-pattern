package com.design.pattern.interceptingPattern;

/**
 * Created by zmm on 2018/12/14
 */
public class AuthenticationFilter implements Filter {

    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
