package com.example.healthrecipes.controller;

import com.example.healthrecipes.model.Users;
import com.example.healthrecipes.service.UsersService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UsersController {
  public UsersService service;
  public UsersController(UsersService service){
    this.service = service;
  }

  @GetMapping(value = "/usersList")
  public List<Users> usersList(){
return service.searchUsers();
  }

  @PostMapping(value = "/users")
  public ResponseEntity<Users> users(@RequestBody Users users){
    Users insertUsers = service.insertUsers(users);
    return new ResponseEntity<>(insertUsers,HttpStatus.OK);

  }


}
