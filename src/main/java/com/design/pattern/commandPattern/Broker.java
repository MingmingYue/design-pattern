package com.design.pattern.commandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmm on 2018/12/11
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
