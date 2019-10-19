package ru.job4j.search;

import java.util.HashMap;
import java.util.List;

public class UserConvert {

    public HashMap <Integer, User> convert(List<User> list) {
        HashMap <Integer, User> map = new HashMap<>(list.size());
         for (User item : list)  {
            map.put(item.getId(), item);
        }
        return map;
    }
}