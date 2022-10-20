package org.example;

@FunctionalInterface
public interface FunctionalInterface1 {

    void abstractMethod1();

    default void method1() {
        System.out.println("interface1 method1 implementation");
    }

    static void method2() {
        System.out.println("interface1 method2 implementation");
    }
}