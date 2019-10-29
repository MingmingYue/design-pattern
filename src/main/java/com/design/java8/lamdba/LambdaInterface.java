package com.design.java8.lamdba;

import com.design.pattern.filterPattern.Person;

/**
 * Create on 2019-10-28.
 */
public class LambdaInterface {

    interface Formula {

        double calculate(int a);

        default double sqrt(int a) {
            return Math.sqrt(positive(a));
        }

        static int positive(int a) {
            return a > 0 ? a : 0;
        }
    }

    @FunctionalInterface
    public interface Converter<F, T> {
        T convert(F from);
    }

    static class Something {
        String startsWith(String s) {
            return String.valueOf(s.charAt(0));
        }
    }

    interface PersonFactory<P extends Person> {
        P create(String firstName, String lastName);
    }

    public static void main(String[] args) {

        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(-23));
        System.out.println(Formula.positive(-4));

        Converter<String, Integer> integerConverter = Integer::parseInt;
        Integer converted = integerConverter.convert("123");
        System.out.println(converted);  // 字符串123 转换成 数字 123

        Something something = new Something();
        Converter<String, String> startsWith = something::startsWith;
        System.out.println(startsWith.convert("Java")); // J

        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
        System.out.println(person);
    }
}