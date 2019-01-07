package com.design.pattern.interceptingPattern;

/**
 * Created by zmm on 2018/12/14
 * 拦截过滤器模式（Intercepting Filter Pattern）用于对应用程序的请求或响应做一些预处理/后处理。定义过滤器，并在把请求传给实际目标应用程序之前应用在请求上。过滤器可以做认证/授权/记录日志，或者跟踪请求，然后把请求传给相应的处理程序
 */
public class InterceptingFilterMain {

    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());



        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }

}
