package com.example.healthrecipes.model;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class MealRecords {

  private int id;
  private int recipeId;
  private LocalDateTime date;
  private String timeSlot;
}
