package com.design.pattern.visitorPattern;

/**
 * Created by zmm on 2018/12/14
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
