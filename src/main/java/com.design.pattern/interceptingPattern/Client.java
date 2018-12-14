package com.design.pattern.interceptingPattern;

/**
 * Created by zmm on 2018/12/14
 */
public class Client {

    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }

}
