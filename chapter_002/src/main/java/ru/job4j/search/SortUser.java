package ru.job4j.search;

import java.util.*;

public class SortUser {

    public Set<User> sort(List<User> list) {
        Set<User> sorted = new TreeSet<>();
        sorted.addAll(list);
        return sorted;
    }
    public List<User> sortNameLength(List<User> list) {
        Collections.sort(
                list,
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        Integer size1 = o1.getName().length();
                        Integer size2 = o2.getName().length();
                        return size1.compareTo(size2);
                    }
                }
        );
        return list;
    }

    /**
     * Method sorts the list of users by the names and age.
     * @param list input unsorted list.
     * @return sorted list.
     */
    public List<User> sortByAllFields(List<User> list) {
        Collections.sort(
                list,
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        int name = o1.getName().compareTo(o2.getName());
                        return name == 0 ? o1.getAge().compareTo(o2.getAge()) : name;
                    }
                }
        );
        return list;
    }
}