package com.design.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Create on 2019-10-28.
 */
public class StreamObjectList {

    static class Foo {
        String name;

        List<Bar> bars = new ArrayList<>();

        Foo(String name) {
            this.name = name;
        }
    }

    static class Bar {
        String name;

        Bar(String name) {
            this.name = name;
        }
    }

    static void test() {
        IntStream.range(1, 4)
                .mapToObj(num -> new Foo("Foo" + num))
                .peek(f -> IntStream.range(1, 4)
                        .mapToObj(num -> new Bar("Bar" + num + " <- " + f.name))
                        .forEach(f.bars::add))
                .flatMap(f -> f.bars.stream())
                .forEach(System.out::println);
    }
}
