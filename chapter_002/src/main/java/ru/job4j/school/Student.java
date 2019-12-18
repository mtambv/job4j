package ru.job4j.school;

import java.util.Objects;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student implements Comparable<Student>{
    private int score;
    private String surname;
    private static long unknownId = 1;

    public Student(int score) {
        this(String.format("Unknown%s", unknownId), score);
        unknownId++;
    }
    public Student(String surname, int score) {
        this.surname = surname;
        this.score = score;
    }

        public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public String toString() {
        return "Student{"
                + "surname='" + surname + '\''
                + ", score=" + score
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score);
    }
    @Override
    public int compareTo(Student o) {
        return surname.compareToIgnoreCase(o.surname);
    }

    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted()
                .takeWhile(student -> student.score >= bound)
                .collect(Collectors.toList());
    }
}