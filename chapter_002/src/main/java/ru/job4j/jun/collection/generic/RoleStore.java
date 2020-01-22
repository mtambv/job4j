package ru.job4j.jun.collection.generic;

public class RoleStore extends GeneralStore<Role> {
    public RoleStore(int size) {
        super(new SimpleArray<>(size));
    }
}