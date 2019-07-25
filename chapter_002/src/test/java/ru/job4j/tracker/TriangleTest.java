package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.chapter1ReFactor.Point;
import ru.job4j.tracker.chapter1ReFactor.Triangle;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // Создаем объект треугольник.
        Triangle triangle = new Triangle(new Point(0,0),new Point(0,2),new Point(2,0));
        // Вычисляем площадь.
        double result = triangle.area ();
        // Задаем ожидаемый результат.
        double expected = 2D;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }
}