package com.design.java8.misc;

import java.lang.annotation.*;

/**
 * Create on 2019-10-29.
 */
public class Annotations {

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
            // @Target 限定标记注解的使用范围 如果超出范围则报错
    @interface MyAnnotation {

    }

    // 1、RetentionPolicy.SOURCE： 注解只保留在源文件，当Java文件编译成class文件的时候，注解被遗弃；
    // 2、RetentionPolicy.CLASS：  注解被保留到class文件，但jvm加载class文件时候被遗弃，这是默认的生命周期；
    // 3、RetentionPolicy.RUNTIME：注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在；
    @Retention(RetentionPolicy.RUNTIME)
    @interface Hints {
        Hint[] value();
    }

    // @Repeatable括号内的就相当于用来保存该注解内容的容器。
    @Repeatable(Hints.class)
    @Retention(RetentionPolicy.RUNTIME)
    @interface Hint {
        String value();
    }

    @Hint("hint1")
    @Hint("hint2")
    class Person {

    }

    public static @MyAnnotation class TypeUseClass<@MyAnnotation T> {
        T foo(@MyAnnotation T t) throws @MyAnnotation Exception {
            return t;
        }
    }

    @SuppressWarnings({"rawtypes", "unused", "resource"})
    public static void main(String[] args) throws Exception {
        TypeUseClass<@MyAnnotation String> typeUseClass = new TypeUseClass<>();
        System.out.println(typeUseClass.foo("123"));

        Hint hint = Person.class.getAnnotation(Hint.class);
        System.out.println(hint);

        Hints hints = Person.class.getAnnotation(Hints.class);
        System.out.println(hints.value().length);

        Hint[] hintList = Person.class.getAnnotationsByType(Hint.class);
        System.out.println(hints.value().length);
    }
}
