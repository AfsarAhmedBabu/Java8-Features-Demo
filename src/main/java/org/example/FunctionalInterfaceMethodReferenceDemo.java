package org.example;

public class FunctionalInterfaceMethodReferenceDemo {

    public static void main(String[] args) {

        System.out.println("Java 8 Features >> Functional Interface Implementation");
        System.out.println("Method Reference Demo");
        System.out.println("---------------------");

        TestFunctionalInterference testFunctionalInterference = MethodReferenceUtil::testMethod;
        testFunctionalInterference.singleAbstractMethod();

        System.out.println();
        System.out.println("Lambda Expression Demo");
        System.out.println("----------------------");

        TestFunctionalInterference testFunctionalInterference1 = () -> {
            System.out.println("Abstract method implementation using lambda expression");
        };

        testFunctionalInterference1.singleAbstractMethod();

    }

}
