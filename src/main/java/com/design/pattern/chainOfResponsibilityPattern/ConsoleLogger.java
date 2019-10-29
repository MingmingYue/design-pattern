package com.design.pattern.chainOfResponsibilityPattern;

/**
 * Created by zmm on 2018/12/10
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
