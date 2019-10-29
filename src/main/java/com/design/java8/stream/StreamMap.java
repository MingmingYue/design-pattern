package com.design.java8.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Create on 2019-10-28.
 */
public class StreamMap {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Max", 18),
                new Person("Mix", 23),
                new Person("Min", 23),
                new Person("Mx", 23),
                new Person("Mei", 29));

//        test(persons);
        test1(persons);
    }

    private static void test(List<Person> persons) {

        Map<Integer, List<Person>> personsByAge = persons
                .stream()
                .collect(Collectors.groupingBy(Person::getAge)); // 年龄转成map

        Double averageAge = persons
                .stream()
                .collect(Collectors.averagingDouble(Person::getAge)); //  年龄平均值

        IntSummaryStatistics ageSummary = persons
                .stream()
                .collect(Collectors.summarizingInt(Person::getAge)); // 条数 大小 平均值 IntSummaryStatistics{count=5, sum=122, min=18, average=24.400000, max=29}
        System.out.println(ageSummary);

        String names = persons
                .stream()
                .map(Person::getName)
                .collect(Collectors.joining(" add ", "In Germany ", " are of legal age.")); // 字符串数组拼接
        // In Germany Max add Mix add Min add Mx add Mei are of legal age.
        System.out.println(names);

        Map<Integer, String> map = persons
                .stream()
                .collect(Collectors.toMap(
                        p -> p.age,
                        p -> p.name,
                        (name, name1) -> name + ":" + name1
                ));
        // {18=Max, 23=Mix:Min:Mx, 29=Mei}
        System.out.println(map);

        Collector<Person, StringJoiner, String> personNameCollector =
                Collector.of(
                        () -> new StringJoiner("|"), //  添加分割符
                        (j, p) -> j.add(p.name.toUpperCase()),
                        (j1, j2) -> j1.merge(j2),             // 聚合到一起
                        StringJoiner::toString);
        String name = persons.stream().collect(personNameCollector);
        System.out.println(name); // MAX|MIX|MIN|MX|MEI
    }

    private static void test1(List<Person> persons) {
        persons
                .stream()
                .reduce((p1, p2) -> p1.age > p2.age ? p1 : p2)  // 取得处理过后的中间值
                .ifPresent(System.out::println);

        System.out.println(persons
                .stream()
                .reduce(new Person("aaa", 10), (p1, p2) -> {
                    p1.age += p2.age;
                    p1.name += p2.name;
                    return p1;
                })); // Person{name='aaaMaxMixMinMxMei', age=126}

        System.out.println(persons
                .stream()
                .reduce(0, (sum, p) -> sum += p.age, (sum1, sum2) -> sum1 + sum2)); // 116

        persons.stream().collect(Collectors.toMap(Person::getAge, Function.identity()));// list 转map
    }

}
