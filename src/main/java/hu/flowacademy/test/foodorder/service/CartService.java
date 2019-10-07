package hu.flowacademy.test.foodorder.service;

import hu.flowacademy.test.foodorder.model.Cart;
import hu.flowacademy.test.foodorder.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CartService {

    @Autowired
    private CartRepository carts;

    public ArrayList<Cart> findAll() {
        return carts.getAll();
    }

    public Cart findOne(String username){
        return carts.getOne(username);
    }

    public void addNew(Cart cart) {
        carts.addNew(cart);
    }

    public void delete(String username) {
        carts.delete(username);
    }
}
