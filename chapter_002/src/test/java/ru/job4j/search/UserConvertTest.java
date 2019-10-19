package ru.job4j.search;

import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {
    @Test
    public void convertListOfUsersToMap() {
        UserConvert converter = new UserConvert();
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Pioytr", "Bryansk"));
        users.add(new User(2, "Andre", "Chisinau"));
        users.add(new User(3, "Joseph", "Moskva"));
        HashMap<Integer, User> result = converter.process(users);
        assertThat(result.get(2).getName(), is("Andre"));
    }
}