package com.example.healthrecipes.controller;

import com.example.healthrecipes.model.Recipes;
import com.example.healthrecipes.service.RecipesService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipesController {
public RecipesService service;
public RecipesController(RecipesService service){
  this.service = service;
}

@GetMapping(value = "/recipesList")
  public List<Recipes> recipesList(){
  return service.searchRecipes();
}
@GetMapping(value = "/recipesIdList")
  public List<Recipes> recipesIdList(){
  return service.searchRecipesId();
}
}
