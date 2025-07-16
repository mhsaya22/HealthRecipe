package com.example.healthrecipes.model;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class Users {

  private int id;
  private String name;
  private String emil;
  private String password;
  private LocalDateTime createdAt;
}
