package com.design.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * java8 基础list的运用
 * Create on 2019-10-19.
 */
public class StreamStingList {

    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        stringCollection
                .stream()
                .filter(s -> s.startsWith("a")) // 过滤出存在a的
                .sorted()                       // 排序
                .forEach(System.out::println);

        System.out.println(stringCollection
                .stream()
                .anyMatch((s) -> s.startsWith("a"))); // 数组中是否存在带有a的

        System.out.println(stringCollection
                .stream()
                .noneMatch(s -> s.startsWith("z"))); // 数组中不存在z

        System.out.println(stringCollection
                .stream()
                .filter(s -> s.startsWith("b"))
                .count());                          // 数组存在b的个数

        Optional<String> reduced =
                stringCollection
                        .stream()
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2);
        reduced.ifPresent(System.out::println);     // 字符拼接

        Supplier<Stream<String>> streamSupplier =
                () -> stringCollection
                        .stream()
                        .filter(s -> s.startsWith("a"));
        System.out.println(streamSupplier.get().anyMatch(s -> true));
        System.out.println(streamSupplier.get().noneMatch(s -> true));


        Stream<String> stream = stringCollection
                .stream()
                .filter(s -> s.startsWith("a"));

        System.out.println(stream.anyMatch(s -> true));
        System.out.println(stream.noneMatch(s -> true));

        Arrays.asList("1", "2", "13", "16")
                .stream()
                .mapToInt(Integer::parseInt)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
