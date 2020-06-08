package com.edustation;

import java.sql.Date;

public class Profile extends Student {

    private final int id;
    private final String name;
    private final String surname;
    private final String username;
    private final String password;
    private final Date birthday;

    public Profile(int id, String name, String surname, String username, String password, Date birthday) {
        super(id, name, surname, username, password, birthday);
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
    }



}
