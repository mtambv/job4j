package ru.job4j;

import org.junit.Test;
import ru.job4j.school.School;
import ru.job4j.school.Student;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    @Test
    public void whenStudentsFilterFrom70To100ThenStudentsFrom70To100() {
        List<Student> students = Arrays.asList(
                new Student(30),
                new Student(70),
                new Student(69),
                new Student(75),
                new Student(100)
        );
        List<Student> expected = Arrays.asList(
                new Student(70),
                new Student(75),
                new Student(100)
        );
        List<Student> result = School.collect(students, student -> 70 <= student.getScore() && student.getScore() <= 100);
        assertThat(result, is(expected));
    }

    @Test
    public void whenStudentsFilterFrom50To70ThenStudentsFrom50To70() {
        List<Student> students = Arrays.asList(
                new Student(50),
                new Student(70),
                new Student(69),
                new Student(35),
                new Student(100)
        );
        List<Student> expected = Arrays.asList(
                new Student(50),
                new Student(69)
        );
        List<Student> result = School.collect(students, student -> 50 <= student.getScore() && student.getScore() < 70);
        assertThat(result, is(expected));
    }

    @Test
    public void whenStudentsFilterFrom0To50ThenStudentsFrom0To50() {
        List<Student> students = Arrays.asList(
                new Student(30),
                new Student(70),
                new Student(69),
                new Student(1),
                new Student(75),
                new Student(100)
        );
        List<Student> expected = Arrays.asList(
                new Student(30),
                new Student(1)
        );
        List<Student> result = School.collect(students, student -> 0 < student.getScore() && student.getScore() < 50);
        assertThat(result, is(expected));
    }
    @Test
    public void whenStudentListConvertToMapThenStudentMap() {
        List<Student> students = Arrays.asList(
                new Student("Surname1", 30),
                new Student("Surname2", 70),
                new Student("Surname3", 69),
                new Student("Surname4", 1),
                new Student("Surname4", 1),
                new Student("Surname4", 2)
        );
        Map<String, Student> expected = new HashMap<>();
        for (Student student : students) {
            expected.put(student.getSurname(), student);
        }
        Map<String, Student> result = School.toMap(students);
        assertThat(result, is(expected));
    }
    @Test
    public void whenGetStudentListLevelOf50ThenStudentsList() {
        List<Student> students = Arrays.asList(
                new Student("C-name", 49),
                null,
                new Student("B-name", 70),
                new Student("A-name", 51),
                null,
                new Student("D-name", 31)
        );
        List<Student> expected = Arrays.asList(
                students.get(3),
                students.get(2)
        );
        List<Student> result = Student.levelOf(students, 50);
        assertThat(result, is(expected));
    }
}