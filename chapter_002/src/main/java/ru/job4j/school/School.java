package ru.job4j.school;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public static List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(
                predict::test
        ).collect(Collectors.toList());
    }
    public static Map<String, Student> toMap(List<Student> students) {
        return students.stream().distinct().collect(
                Collectors.toMap(
                        Student::getSurname,
                        student -> student
                )
        );
    }
}