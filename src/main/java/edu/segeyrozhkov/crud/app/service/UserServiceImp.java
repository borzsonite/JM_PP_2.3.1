package edu.segeyrozhkov.crud.app.service;

import edu.segeyrozhkov.crud.app.dao.UserDao;
import edu.segeyrozhkov.crud.app.model.Role;
import edu.segeyrozhkov.crud.app.model.User;
import edu.segeyrozhkov.crud.app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    //CRUD part
    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.addUser(user);
    }

    @Override
    @Transactional
    public void removeUser(int id) {
        userDao.removeUser(id);
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public List<User> userList() {
        return userDao.userList();
    }

}

