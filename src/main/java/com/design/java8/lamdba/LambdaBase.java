package com.design.java8.lamdba;

import com.design.pattern.filterPattern.Person;

import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.*;

/**
 * Create on 2019-10-28.
 */
public class LambdaBase {

    public static void main(String[] args) throws Exception {

        Predicate<String> predicate = s -> s.length() > 0;

        predicate.test("foo");         // true
        predicate.negate().test("foo");// false    negate 逻辑取反

        Predicate<Boolean> nonNull = Objects::nonNull;
        System.out.println(nonNull.test(true));  // true
        Predicate<Boolean> isNull = Objects::isNull;
        System.out.println(isNull.test(true));   // false

        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backString = toInteger.andThen(String::valueOf);  // andThen 返回一个组合函数，after将会在该函数执行之后应用

        backString.apply("123"); // "123"

        Supplier<Person> personSupplier = Person::new;
        personSupplier.get(); // new person

        Consumer<Person> greeter = p -> System.out.println("Hello," + p.getName());
        greeter.accept(new Person("Luke", "SkyWalker"));  // Hello,Luke  accept 对给定的参数执行操作

        Comparator<Person> comparator = Comparator.comparing(Person::getName);
        Person person = new Person("123", "123");
        Person person1 = new Person("567", "567");
        System.out.println(comparator.compare(person, person1)); // <0 参数比较

        Runnable runnable = () -> System.out.println(UUID.randomUUID());
        runnable.run();

        Callable<UUID> callable = UUID::randomUUID;
        callable.call();

        BiConsumer<String, Integer> integerBiConsumer =
                (key, value) -> System.out.println(key + "->" + value);
        integerBiConsumer.accept("one", 1);
        integerBiConsumer.accept("two", 2);
    }
}
