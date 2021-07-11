package edu.segeyrozhkov.crud.app.service;

import edu.segeyrozhkov.crud.app.dao.UserDao;
import edu.segeyrozhkov.crud.app.model.User;
import edu.segeyrozhkov.crud.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImp implements UserService {
//    @Autowired
//    private UserRepository repository;

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void updateUser(User user) {
       // repository.save(user);
        userDao.addUser(user);
    }

    @Override
    @Transactional
    public void removeUser(int id) {
       // repository.deleteById(id);
        userDao.removeUser(id);
    }

    @Override
    @Transactional
    public User getUserById(int id) {
//        Optional<User> user = repository.findById(id);
//        return user.orElse(null);
        return userDao.getUserById(id);

    }

    @Override
    @Transactional
    public List<User> userList() {
//        return repository.findAll();
        return userDao.userList();
    }
}

