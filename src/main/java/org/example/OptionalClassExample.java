package org.example;

import java.util.Optional;

public class OptionalClassExample {

    public static void main(String[] args) {

        System.out.println("Java 8 Features >> Optional Class Demo");
        System.out.println("Optional classes are public final class " +
                "and used to deal with NullPointerException in Java application");
        System.out.println("---------------------------------------------------");

        String[] str = new String[] { "abc","bca","aca","cbc","def",null,null,null } ;

        // It returns an Optional describing the specified value,
        // if non-null, otherwise returns an empty Optional.
        Optional<String> sixthString = Optional.ofNullable(str[5]);

        if (sixthString.isPresent()) {
            String lowerCaseString = str[5].toLowerCase();
            System.out.println(lowerCaseString);
        } else {
            System.out.println("String at index 5 is null");
        }

        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[4]);
        System.out.printf("Filtered value: " + value.filter(s -> s.equalsIgnoreCase("def")));

    }

}
