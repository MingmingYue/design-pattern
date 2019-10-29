package com.design.pattern.visitorPattern;

/**
 * Created by zmm on 2018/12/14
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
