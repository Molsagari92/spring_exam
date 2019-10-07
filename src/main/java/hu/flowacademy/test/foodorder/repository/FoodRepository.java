package hu.flowacademy.test.foodorder.repository;

import hu.flowacademy.test.foodorder.model.Food;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class FoodRepository {

    ArrayList<Food> foods = new ArrayList<>();

    public void setUsers(int i, Food food){
        foods.set(i, food);
    }

    public ArrayList<Food> getAll() {
        return foods;
    }

    public Food getOne(String username){
        for(int i=0;i<foods.size(); i++){
            if(foods.get(i).getName().equals(username)){
                return foods.get(i);
            }
        }
        return null;
    }

    public void addNew(Food food) {
        foods.add(food);
    }

    public void modify(Food food) {
        for (int i=0;i<foods.size();i++){
            if(foods.get(i).getName().equals(food.getName())){
                foods.set(i, food);
            }
        }
    }

    public void delete(String username) {
        for (int i=0;i<foods.size();i++){
            if(foods.get(i).getName().equals(username)){
                foods.set(i, null);
            }
        }
    }
}
