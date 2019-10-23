package ru.job4j.search;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

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

    @Test
    public void whenAddFourAndSortByNameLength() {
        SortUser sort = new SortUser();
        List<User> users = new ArrayList<>();
        users.addAll(
                Arrays.asList(
                        new User(1,"Roman", "Omsk",33),
                        new User(2,"Ivan","Omsk", 18),
                        new User(3,"Sergey", "Omsk",55),
                        new User(4,"Olga","Omsk", 30)
                )
        );
        sort.sortNameLength(users);
        assertThat(users.get(3).getName(), is("Sergey"));
    }

    @Test
    public void whenAddFourAndSortByNameLengthAndAge() {
        SortUser sort = new SortUser();
        List<User> users = new ArrayList<>();
        users.addAll(
                Arrays.asList(
                        new User(1,"Roman","Omsk", 33),
                        new User(2,"Sergey","Omsk", 55),
                        new User(3,"Sergey","Omsk", 30),
                        new User(4,"Roman","Omsk", 18)
                )
        );
        sort.sortByAllFields(users);
        assertThat(users.get(3).getAge(), is(55));
    }

    @Test
    public void whenAddFourAndSortByNameLengthAndAgeByShort() {
        SortUser sort = new SortUser();
        List<User> users = new ArrayList<>();
        users.addAll(
                Arrays.asList(
                        new User(1,"Roman","Omsk", 33),
                        new User(2,"Sergey","Omsk", 55),
                        new User(3,"Sergey","Omsk", 30),
                        new User(4,"Roman","Omsk", 18)
                )
        );
        sort.sortByAllFields(users);
        assertThat(users.get(3).getAge(), is(55));
    }

    }
