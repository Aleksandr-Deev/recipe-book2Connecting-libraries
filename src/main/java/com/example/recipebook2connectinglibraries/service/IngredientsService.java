package com.example.recipebook2connectinglibraries.service;

import com.example.recipebook2connectinglibraries.model.Ingredient;

public interface IngredientsService {

     Ingredient addIngredient(Ingredient ingredient);

     Ingredient getIngredientId(long id);

     Ingredient updateIngredient(long id, Ingredient ingredient);

     Ingredient remoweIngredient(long id);
}
