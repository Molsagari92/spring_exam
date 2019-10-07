package hu.flowacademy.test.foodorder.service;

import hu.flowacademy.test.foodorder.model.Food;
import hu.flowacademy.test.foodorder.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foods;

    public ArrayList<Food> findAll() {
        return foods.getAll();
    }

    public Food findOne(String username){
        return foods.getOne(username);
    }

    public void addNew(Food food) {
        foods.addNew(food);
    }

    public void update(Food food) {
        foods.modify(food);
    }

    public void delete(String username) {
        foods.delete(username);
    }

}
