package com.example.recipebook2connectinglibraries.service.impl;

import com.example.recipebook2connectinglibraries.model.Recipe;
import com.example.recipebook2connectinglibraries.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final Map<Long, Recipe> recipes = new HashMap<>();
    private static long lastId = 0;

    public Recipe addRecipe(Recipe recipe) {
        if (recipes.containsKey(recipe.getId())) {
            throw new RuntimeException("Такой рецепт уже добавлен");
        } else {
            recipes.put(lastId++, recipe);
        }
        return recipe;
    }


    public Recipe getRecipeId(long id) {
        if (recipes.containsKey(id)) {
            return recipes.get(id);
        } else {
            throw new RuntimeException("Рецепт не найден");
        }
    }

    public Collection<Recipe> getAllRecipes() {
        return recipes.values();
    }

    public Recipe updateRecipe(long id, Recipe recipe) {
        if (recipes.containsKey(id)) {
            return recipes.put(id, recipe);
        } else {
            throw new RuntimeException("Рецепт не найден");
        }
    }

    public Recipe remoweRecipe(long id) {
        if (recipes.containsKey(id)) {
            return recipes.remove(id);
        }else {
            throw new RuntimeException("Рецепт не найден");
        }
    }
}
