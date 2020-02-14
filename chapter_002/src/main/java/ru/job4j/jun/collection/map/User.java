package ru.job4j.jun.collection.map;

import java.util.Calendar;

public class User {

    private String name;
    private int children;
    private Calendar birthday;


    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getChildren() {
        return children;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + children;
        result = 31 * result + birthday.hashCode();
        return result;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return  false;
        }
        User o = (User) obj;
        if (!name.equals(o.name) || children != o.children || !birthday.equals(o.birthday)) {
            return false;
        }
        return  true;
    }
}
