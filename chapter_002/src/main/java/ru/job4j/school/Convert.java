package ru.job4j.school;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Convert {
    public static List<Integer> toList(Integer[][] integers) {
        return Stream.of(integers).flatMap(Stream::of).collect(Collectors.toList());
    }
}