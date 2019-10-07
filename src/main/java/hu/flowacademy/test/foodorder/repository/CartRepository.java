package hu.flowacademy.test.foodorder.repository;

import hu.flowacademy.test.foodorder.model.Cart;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CartRepository {

    ArrayList<Cart> carts = new ArrayList<>();


    public ArrayList<Cart> getAll() {
        return carts;
    }

    public Cart getOne(String username) {
        for (int i = 0; i < carts.size(); i++) {
            if (carts.get(i).getUser().getUsername().equals(username)) {
                return carts.get(i);
            }
        }
        return null;
    }

    public void addNew(Cart cart) {
        carts.add(cart);
    }


    public void delete(String username) {
        for (int i = 0; i < carts.size(); i++) {
            if (carts.get(i).getUser().getUsername().equals(username)) {
                carts.set(i, null);
            }
        }
    }

}
