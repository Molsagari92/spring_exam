package hu.flowacademy.test.foodorder.controller;

import hu.flowacademy.test.foodorder.model.Food;
import hu.flowacademy.test.foodorder.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/allfoods")
    public ArrayList<Food> getAll() {
        return foodService.findAll();
    }

    @GetMapping("/onefood")
    public Food getOne(@RequestParam String username) {
        return foodService.findOne(username);
    }

    @PostMapping("/addfood")
    public Food createUser(@RequestBody Food food) {
        foodService.addNew(food);
        return food;
    }

    @PutMapping("/updatefood")
    public Food updateFood(@RequestBody Food food) {
        foodService.update(food);
        return food;
    }

    @DeleteMapping("/deleteFood")
    public void deleteFood(@RequestParam String username) {
        foodService.delete(username);
    }
}
