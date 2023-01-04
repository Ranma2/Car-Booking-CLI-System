package com.ranaelle.user;

import java.util.UUID;

public class UserService {
    private  UserDAO userDAO = new UserDAO();
    
    public User findUser(UUID id){
        User user = null;
        for(int i = 0; i < seeUsers().length; i++){
            if(seeUsers()[i].getId().equals(id)){
                user = seeUsers()[i];
            }
        }
        return user;
    }
    

    public User[] seeUsers(){
        return userDAO.getUsers();
    }


}
