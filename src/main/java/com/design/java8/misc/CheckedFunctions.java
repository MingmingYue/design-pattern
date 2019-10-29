package com.design.java8.misc;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Create on 2019-10-29.
 */
public final class CheckedFunctions {

    @FunctionalInterface
    public interface CheckedConsumer<T> {
        void accept(T input) throws Exception;
    }

    @FunctionalInterface
    public interface CheckedPredicate<T> {
        boolean test(T test) throws Exception;
    }

    @FunctionalInterface
    public interface CheckedFunction<F, T> {
        T apply(F input);
    }

    private static <F, T> Function<F, T> function(CheckedFunction<F, T> function) {
        return input -> {
            try {
                return function.apply(input);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }

    private static <T> Predicate<T> predicate(CheckedPredicate<T> predicate) {
        return input -> {
            try {
                return predicate.test(input);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }

    private static <T> Consumer<T> consumer(CheckedConsumer<T> consumer) {
        return input -> {
            try {
                consumer.accept(input);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }


    public static void main(String[] args) {
        CheckedFunction<String, String> checkedFunction = String::toUpperCase;
        System.out.println(function(checkedFunction).apply("one"));

        CheckedPredicate<String> checkedPredicate = String::isEmpty;
        System.out.println(predicate(checkedPredicate).test(""));

        CheckedConsumer<String> checkedConsumer = String::valueOf;
        consumer(checkedConsumer).accept("");
    }

}
