package ru.job4j.search;

import java.util.HashMap;
import java.util.List;




public class UserConvert {

    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> map = new HashMap<>();
         for (User item : list)  {
            map.put(item.getId(), item);
        }
        return map;
    }
}