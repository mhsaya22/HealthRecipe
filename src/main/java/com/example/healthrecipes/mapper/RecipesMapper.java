package com.example.healthrecipes.mapper;

import com.example.healthrecipes.model.Recipes;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RecipesMapper {

@Select("select * from recipes")
  List<Recipes> selectRecipesList();
@Select("select id from recipes")
  List<Recipes> selectRecipesIdList();
}
