package edu.segeyrozhkov.crud.app.dao;

import edu.segeyrozhkov.crud.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

public interface UserDao {

     void addUser(User user);

     void updateUser(User user);

     void removeUser(int id);

     User getUserById(int id);

     List<User> userList();


}
