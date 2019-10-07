package hu.flowacademy.test.foodorder.model;

import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Component
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private User user;
    private LocalDateTime orderDate;
    private Food[] foods;


    public Cart(User user, LocalDateTime orderDate, Food[] foods) {
        this.user = user;
        this.orderDate = orderDate;
        this.foods = foods;
    }

    public Cart(){
        this.user=new User();
        this.orderDate=null;
        this.foods=null;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Food[] getFoods() {
        return foods;
    }
}
