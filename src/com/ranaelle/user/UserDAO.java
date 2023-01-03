package com.ranaelle.user;

import java.util.UUID;

public class UserDAO {
    private static final User[] users;

    static {
        users = new User[]{
                new User("Cherry", 19, UUID.fromString("fbffd641-7b51-41d5-af71-ec9d84f4f4df") ),
                new User("Teza", 30, UUID.fromString("d0e0c536-5441-475f-941a-a704e13da550")),
                new User("Gon", 22, UUID.fromString("a6c8c561-a0c0-4e27-b49a-c15aa36a60ee"))


        };
    }

    public User[] getUsers(){
        return users;
    }


}
