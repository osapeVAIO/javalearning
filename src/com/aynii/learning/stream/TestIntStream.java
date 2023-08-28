package com.aynii.learning.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestIntStream {
    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        list.forEach(System.out::println);
        List<Integer> list1 = IntStream.range(1, 10).boxed().collect(Collectors.toUnmodifiableList());
        list1.forEach(System.out::println);
    }
}
