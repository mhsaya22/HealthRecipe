package com.example.healthrecipes.model;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Recipes {
  private int id;
  private int userId;
  private String title;
  private String description;
  private String imageUrl;
  private LocalDateTime createdAt;
}
