package ru.netology.springrest.Repository;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import ru.netology.springrest.Config.Authorities;
import ru.netology.springrest.Model.Person;

import java.util.*;

@Repository
public class UserRepository {
    private Person person;

    public UserRepository() {
        person = new Person("user", "user");
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (person.getUser() == user && person.getPassword() == password) {
            return Arrays.asList(Authorities.values());
        } else {
            return Collections.emptyList();
        }
    }
}
