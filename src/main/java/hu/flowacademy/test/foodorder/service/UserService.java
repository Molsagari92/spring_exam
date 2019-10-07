package hu.flowacademy.test.foodorder.service;

import hu.flowacademy.test.foodorder.model.User;
import hu.flowacademy.test.foodorder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    private UserRepository users;

    public ArrayList<User> findAll() {
        return users.getAll();
    }

    public User findOne(String username){
        return users.getOne(username);
    }

    public void addNew(User user) {
        users.addNew(user);
    }

    public void update(User user) {
        users.modify(user);
    }

    public void delete(String username) {
        users.delete(username);
    }
}
