package ru.job4j.adres;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(
                Profile::getAddress
        ).sorted(new Comparator<Address>() {
            @Override
            public int compare(Address address, Address t1) {
                return address.getCity().compareToIgnoreCase(t1.getCity());
            }
        }).distinct().collect(Collectors.toList());
    }
}