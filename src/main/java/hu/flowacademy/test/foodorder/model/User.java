package hu.flowacademy.test.foodorder.model;

import org.springframework.stereotype.Component;

import javax.persistence.Id;

@Component
public class User {

    public String username;
    private String fullname;
    private String address;

    public User(String username, String fullname, String address) {
        this.username = username;
        this.fullname = fullname;
        this.address = address;
    }

    public User(){
        this.username="";
        this.fullname="";
        this.address="";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
