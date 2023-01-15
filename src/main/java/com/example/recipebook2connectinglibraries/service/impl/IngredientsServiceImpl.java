package com.example.recipebook2connectinglibraries.service.impl;

import com.example.recipebook2connectinglibraries.model.Ingredient;
import com.example.recipebook2connectinglibraries.service.IngredientsService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientsServiceImpl implements IngredientsService {

    public Map<Long, Ingredient> ingredients = new HashMap<>();
    private static long lastId = 0;

    public Ingredient addIngredient(Ingredient ingredient) {
        if (ingredients.containsKey(ingredient.getId())) {
            throw new RuntimeException("Такой ингридиент уже добавлен");
        } else {
            ingredients.put(lastId++, ingredient);
        }
        return ingredient;
    }

    public Ingredient getIngredientId(long id) {
        if (ingredients.containsKey(id)) {
            return ingredients.get(id);
        } else {
            throw new RuntimeException("ингридиент не найден");
        }
    }

    public Ingredient updateIngredient(long id, Ingredient ingredient) {
        if (ingredients.containsKey(id)) {
            return ingredients.put(id, ingredient);
        }
        return null;
    }

    public Ingredient remoweIngredient(long id) {
        return ingredients.remove(id);
    }
}

