package ru.netology.springrest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private String user;
    private String password;

    public Person(String user, String password) {
        this.user = user;
        this.password = password;
    }
}
