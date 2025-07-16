package com.example.healthrecipes.service;

import com.example.healthrecipes.mapper.RecipesMapper;
import com.example.healthrecipes.model.Recipes;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RecipesService {

  public RecipesMapper mapper;
  public RecipesService (RecipesMapper mapper){
    this.mapper = mapper;
  }

  public List<Recipes> searchRecipes(){
    return mapper.selectRecipesList();
  }
  public List<Recipes> searchRecipesId(){
    return mapper.selectRecipesIdList();
  }
}
