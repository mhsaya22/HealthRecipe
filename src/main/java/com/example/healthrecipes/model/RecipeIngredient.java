package com.example.healthrecipes.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class RecipeIngredient {
 private int id;
 private int recipeId;
 private int ingredientId;
 private Float guram;

}
