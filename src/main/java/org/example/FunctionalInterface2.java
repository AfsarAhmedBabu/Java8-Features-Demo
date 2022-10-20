package org.example;

@FunctionalInterface
public interface FunctionalInterface2 {

    void abstractMethod2();

    default void method1() {
        System.out.println("interface2 method1 implementation");
    }

    static void method2() {
        System.out.println("interface2 method2 implementation");
    }
}
