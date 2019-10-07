package hu.flowacademy.test.foodorder.repository;


import hu.flowacademy.test.foodorder.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class UserRepository {

    ArrayList<User> users=new ArrayList<>();

    public void setUsers(int i, User user){
        users.set(i, user);
    }

    public ArrayList<User> getAll() {
        return users;
    }

    public User getOne(String username){
        for(int i=0;i<users.size(); i++){
            if(users.get(i).getUsername().equals(username)){
                return users.get(i);
            }
        }
        return null;
    }

    public void addNew(User user) {
        users.add(user);
    }

    public void modify(User user) {
        for (int i=0;i<users.size();i++){
            if(users.get(i).getUsername().equals(user.getUsername())){
               users.set(i, user);
            }
        }
    }

    public void delete(String username) {
        for (int i=0;i<users.size();i++){
            if(users.get(i).getUsername().equals(username)){
                users.set(i, null);
            }
        }
    }
}
