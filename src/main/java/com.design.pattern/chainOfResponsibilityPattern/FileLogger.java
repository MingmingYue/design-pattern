package com.design.pattern.chainOfResponsibilityPattern;

/**
 * Created by zmm on 2018/12/10
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
