package ru.job4j.jun.collection.generic;

public class UserStore extends GeneralStore<User> {
    public UserStore(int size) {
        super(new SimpleArray<>(size));
    }
}