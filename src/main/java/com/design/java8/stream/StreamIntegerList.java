package com.design.java8.stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Create on 2019-10-27.
 */
public class StreamIntegerList {

    public static void main(String[] args) {
        IntStream
                .range(0, 10)                   // 0 - 10 的数组
                .filter(i -> i % 2 == 1)
                .forEach(System.out::println);

        OptionalInt reduced1 = IntStream
                .range(0, 10)
                .reduce((a, b) -> a + b);       //  数组相加
        System.out.println(reduced1.getAsInt());

        System.out.println(IntStream
                .range(0, 10)
                .reduce(7, (a, b) -> a + b) // 底数 + 数据相加
        );

        Stream
                .of(new BigDecimal("1.2"), new BigDecimal("3.7"))
                .mapToDouble(BigDecimal::doubleValue)
                .average()                        // 平均数
                .ifPresent(System.out::println);

        int[] ints = {1, 3, 5, 7, 11};
        Arrays
                .stream(ints)
                .average()
                .ifPresent(System.out::println);
    }
}
