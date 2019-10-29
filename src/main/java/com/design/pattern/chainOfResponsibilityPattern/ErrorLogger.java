package com.design.pattern.chainOfResponsibilityPattern;

/**
 * Created by zmm on 2018/12/10
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
