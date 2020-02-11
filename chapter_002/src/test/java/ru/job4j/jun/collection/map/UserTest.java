package ru.job4j.jun.collection.map;

import org.junit.Test;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class UserTest {

    @Test
    public void whenNonOverrideEqualsThen() {
        Map<User, Object> map = new HashMap<>();
        User first = new User("Petya", 0, new GregorianCalendar(1984, 9, 15));
        User second = new User("Petya", 0, new GregorianCalendar(1984, 9, 15));
        map.put(first, "one");
        map.put(second, "two");
        System.out.println(map);
    }
}