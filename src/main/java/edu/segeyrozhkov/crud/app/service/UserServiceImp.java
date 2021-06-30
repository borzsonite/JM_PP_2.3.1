package edu.segeyrozhkov.crud.app.service;

import edu.segeyrozhkov.crud.app.model.User;
import edu.segeyrozhkov.crud.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public void addUser(User user) {
        repository.save(user);
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void removeUser(int id) {
        repository.deleteById(id);
    }

    @Override
    public User getUserById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<User> userList() {
        return repository.findAll();
    }
}

