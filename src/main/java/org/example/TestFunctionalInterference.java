package org.example;

@FunctionalInterface
public interface TestFunctionalInterference {

    void singleAbstractMethod();

    default void method1() {
        System.out.println("Default method implementation");
    }

    static void method2() {
        System.out.printf("Static method implementation");
    }

}
