package ru.netology.springrest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springrest.config.Authorities;
import ru.netology.springrest.model.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    private final Person person;

    public UserRepository() {
        person = new Person("user", "user");
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (person.getUser().equals(user) && person.getPassword().equals(password)) {
            return Arrays.asList(Authorities.values());
        } else {
            return Collections.emptyList();
        }
    }
}
