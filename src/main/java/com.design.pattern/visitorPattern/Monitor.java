package com.design.pattern.visitorPattern;

/**
 * Created by zmm on 2018/12/14
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
