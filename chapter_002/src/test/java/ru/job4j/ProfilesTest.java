package ru.job4j;

import org.junit.Test;
import ru.job4j.adres.Address;
import ru.job4j.adres.Profile;
import ru.job4j.adres.Profiles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    @Test
    public void whenGetListAddressInProfilesThenListAddress() {
        List<Profile> profiles = Arrays.asList(
                new Profile(new Address("1", "1", 1, 1)),
                new Profile(new Address("1", "1", 1, 2)),
                new Profile(new Address("1", "1", 1, 3)),
                new Profile(new Address("1", "1", 1, 4)),
                new Profile(new Address("1", "1", 1, 5))
        );
        List<Address> expected = new ArrayList<>();
        profiles.forEach(profile -> expected.add(profile.getAddress()));
        List<Address> addresses = Profiles.collect(profiles);
        assertThat(addresses, is(expected));
    }
}