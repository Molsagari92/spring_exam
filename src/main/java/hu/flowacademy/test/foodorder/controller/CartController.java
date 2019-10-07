package hu.flowacademy.test.foodorder.controller;

import hu.flowacademy.test.foodorder.model.Cart;
import hu.flowacademy.test.foodorder.model.Food;
import hu.flowacademy.test.foodorder.service.CartService;
import hu.flowacademy.test.foodorder.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/allcarts")
    public ArrayList<Cart> getAll() {
        return cartService.findAll();
    }

    @GetMapping("/onecart")
    public Cart getOne(@RequestParam String name) {
        return cartService.findOne(name);
    }

    @PostMapping("/addcart")
    public Cart createFood(@RequestBody Cart cart) {
        cartService.addNew(cart);
        return cart;
    }

    @DeleteMapping("/deletecart")
    public void deleteCart(@RequestParam String name) {
        cartService.delete(name);
    }
}
