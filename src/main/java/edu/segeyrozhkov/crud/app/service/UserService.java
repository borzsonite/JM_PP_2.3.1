package edu.segeyrozhkov.crud.app.service;

import edu.segeyrozhkov.crud.app.model.User;

import java.util.List;

public interface UserService {

    void updateUser(User user);

    void removeUser(int id);

    User getUserById(int id);

    List<User> userList();
}
