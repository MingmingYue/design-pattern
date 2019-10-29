package com.design.java8.lamdba;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Create on 2019-10-28.
 */
public class LambdaStringList {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("peter", null, "anna", "mike", "xenia", null);
        list.sort(Comparator.nullsFirst(String::compareTo)); // null 的在数组最开始
        list.sort(Comparator.nullsLast(String::compareTo)); // null 的在数组最后
        System.out.println(list);

        list = Arrays.asList("peter", "anna", "mike", "xenia");
        Optional.ofNullable(list).ifPresent(ss -> ss.sort(Comparator.naturalOrder())); // 自然排序
        System.out.println(list);


    }
}
