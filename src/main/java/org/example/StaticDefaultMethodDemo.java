package org.example;

public class StaticDefaultMethodDemo {

    public static void main(String[] args) {

        System.out.println("Java 8 Features >> Static and Default Method Demo");
        System.out.println("-------------------------------------------------");

        System.out.println();
        System.out.println("Calling Default method: ");
        System.out.println("-----------------------");
        StaticDefaultMethodImplementationClass obj = new StaticDefaultMethodImplementationClass();
        obj.method1();

        System.out.println();
        System.out.println("Calling Static methods: ");
        System.out.println("----------------------");
        FunctionalInterface1.method2();
        FunctionalInterface2.method2();

    }

}






