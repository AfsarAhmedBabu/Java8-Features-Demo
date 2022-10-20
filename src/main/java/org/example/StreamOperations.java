package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOperations {

    public static void main(String[] args) {

        System.out.println("Java 8 Features >> Stream Operations");
        System.out.println("------------------------------------");

        // Stream takes Collections, Arrays or I/O inputs and transmit them in sequence
        // and performs aggregate operations such as
        // filter, map, limit, reduce, find, match, sorted, Parallel processing, statistics

        List<String> strings = Arrays.asList("abc","def","","gh","ij","klm","nop","suv","","mer","","tither", "gh", "abc");
        List<Integer> numbers = Arrays.asList(5, 4, 2, 1, 3, 2, 2, 6, 2, 3, 7, 9, 1);

        System.out.println("Strings that are not empty: ");
        List<String> nonEmptyStrings = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        System.out.println(nonEmptyStrings);

        System.out.println("Square root of the numbers: ");
        List<Integer> sqtOfNumbers = numbers.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println(sqtOfNumbers);

        System.out.println("Number of empty strings: ");
        long count = strings.stream().filter(str -> str.isEmpty()).count();
        System.out.println(count);

        System.out.println("Number of strings with length 2: ");
        long count2 = strings.stream().filter(str -> str.length() == 2).count();
        System.out.println(count2);

        System.out.println("Number of non empty strings with parallel processing: ");
        long countAll = strings.parallelStream().filter(str -> !str.isEmpty()).count();
        System.out.println(countAll);

        System.out.println("Sum of all numbers adding 10: ");
        int sum = numbers.parallelStream().reduce(0, Integer::sum)+10;
        System.out.println(sum);

        System.out.printf("Any match abc in strings: ");
        boolean isMatch = strings.stream().anyMatch(str -> !str.isEmpty());
        System.out.println(isMatch);

        System.out.println("findFirst abc: ");
        strings.stream().filter(str->str.equals("abc")).findFirst().ifPresent(System.out::println);

        System.out.println("Print 5 random numbers with limit and sort: ");
        System.out.println("------------------------------------------------");
        Random random = new Random();
        random.ints().limit(5).sorted().forEach(System.out::println);
        System.out.println("------------------------------------------------");

        System.out.printf("Finding duplicate in list: ");
        System.out.println("Method1: ");
        System.out.println("----------");

        Set<String> uniqueStrings = new HashSet<>();
        Set<String> duplicateStrings = strings.stream().filter(str -> !str.isEmpty() && !uniqueStrings.add(str)).collect(Collectors.toSet());
        System.out.println(duplicateStrings);

        System.out.println("Method2");
        System.out.println("-----------");

        Map<String, Long> map = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<String> duplicateStrings2 = map.entrySet().stream().filter(entry -> !entry.getKey().isEmpty() && entry.getValue() > 1).map(entry -> entry.getKey()).collect(Collectors.toSet());
        System.out.println(duplicateStrings2);

        System.out.println("Method3");
        System.out.println("-----------");

        Set<String> duplicateStrings3 = strings.stream().filter(str -> !str.isEmpty() && Collections.frequency(strings, str) > 1).collect(Collectors.toSet());
        System.out.println(duplicateStrings3);

    }

}