package com.design.pattern.strategyPattern;

/**
 * @author: ZhouMingming
 * @data: Create on 2018/12/13.
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
