package com.design.java8.stream;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * Create on 2019-10-27.
 */
public class StreamOptional {

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("bam");

        optional.isPresent();                   // true
        optional.get();                        // "bam"
        optional.orElse("fallback");    // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"


        test1();
        test2();
        test3();
    }


    private static <T> Optional<T> resolve(Supplier<T> resolver) {
        try {
            T result = resolver.get();
            return Optional.ofNullable(result);
        } catch (NullPointerException e) {
            return Optional.empty();
        }
    }

    private static void test3() {
        Outer outer = new Outer();
        resolve(() -> outer.getNested().getInner().getFoo())
                .ifPresent(System.out::println);
    }

    private static void test2() {
        Optional.of(new Outer())
                .map(Outer::getNested)
                .map(Nested::getInner)
                .map(Inner::getFoo)
                .ifPresent(System.out::println);
    }

    private static void test1() {
        Optional.of(new Outer())
                .flatMap(o -> Optional.ofNullable(o.nested))
                .flatMap(n -> Optional.ofNullable(n.inner))
                .flatMap(i -> Optional.ofNullable(i.foo))
                .ifPresent(System.out::println);
    }

    static class Outer {
        Nested nested = new Nested();

        private Nested getNested() {
            return nested;
        }
    }

    static class Nested {
        Inner inner = new Inner();

        private Inner getInner() {
            return inner;
        }
    }

    static class Inner {
        String foo = "boo";

        private String getFoo() {
            return foo;
        }
    }
}
