package com.ranaelle.user;

import java.util.UUID;

public class UserService {
    private  UserDAO userDAO = new UserDAO();

    public User[] seeUsers(){
        return userDAO.getUsers();
    }


}
