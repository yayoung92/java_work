package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main5 {
    public static void main(String[] args) {
//        List<String> list1 = Arrays.asList("BOX","ROBOT","SIMPLE");
//
//        Stream<Integer> is = list1.stream().map(s -> s.length());
//        is.forEach(System.out::println);
//
//        list1.stream().map(s -> s+s).forEach(System.out::println);
//        list1.stream().map(s -> { return s + " 입니다.";}).forEach(System.out::println);

        Person p1 = new Person("홍길동",20);
        Person p2 = new Person("김길동",20);
        Person p3 = new Person("이길동",30);
        Person p4 = new Person("박길동",34);

        List<Person> list = Arrays.asList(p1,p2,p3,p4);
        list.stream()
                .map(person -> person.getName() + " 입니다.")
                .forEach(System.out::println);

        System.out.println();
        for(Person person : list){
            System.out.println(person.getName() + " 입니다.");
        }

        int sum2 = list.stream()
                .mapToInt(person -> person.getAge())
                .filter(integer -> integer>20)
                .sum();
                //.reduce(0,(integer, integer2) -> integer+=integer2);
                //.reduce(0,(a, b) -> {return a+b;});
        System.out.println(sum2);

    }
}
