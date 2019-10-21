package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortUserTest {
    @Test
    public void whenThreeUsersWithDifferenAge() {
        SortUser sUser = new SortUser();
        User user1 = new User(1,"Vovan", "Novonikolaevsk", 33);
        User user2 = new User(2,"Dasha","Omsk" ,24);
        User user3 = new User(66,"Habib", "Grozny", 65);
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        Set<User> result = sUser.sort(list);
        Set<User> expect = new LinkedHashSet<>();
        expect.add(user1);
        expect.add(user2);
        expect.add(user3);
        assertThat(result, is(expect));
    }

    @Test
    public void whenThreeUsersSameAge() {
        SortUser sUser = new SortUser();
        User user1 = new User(1,"Vovan", "Novonikolaevsk", 24);
        User user2 = new User(2,"Dasha","Omsk" ,24);
        User user3 = new User(66,"Habib", "Grozny", 65);
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        Set<User> result = sUser.sort(list);
        Set<User> expect = new LinkedHashSet<>();
        expect.add(user1);
        expect.add(user2);
        expect.add(user3);
        assertThat(result, is(expect));
    }
    }