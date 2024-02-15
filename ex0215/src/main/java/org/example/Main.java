package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5};
        IntStream is = Arrays.stream(ar);
        is.forEach(System.out::println);
        // 람다식
        //is.forEach(s -> System.out.println(s));

        Arrays.stream(ar).forEach(System.out::println);

        System.out.println();

        List<Integer> list = Arrays.asList(11,22,33,44,55);
        Stream<Integer> is2 = list.stream();
        is2.forEach(System.out::println);

        list.stream().forEach(System.out::println);
    }
}