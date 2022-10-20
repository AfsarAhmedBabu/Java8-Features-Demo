package org.example;

public class StaticDefaultMethodImplementationClass implements FunctionalInterface1, FunctionalInterface2 {

    @Override
    public void abstractMethod1() {
        System.out.println("abstract interface 1 abstract method 1 implementation");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("abstract interface 2 abstract method 2 implementation");
    }

    @Override
    public void method1() {
        FunctionalInterface1.super.method1();
        FunctionalInterface1.method2();
    }



}
