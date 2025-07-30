package com.example.healthrecipes.service;

import com.example.healthrecipes.mapper.UsersMapper;
import com.example.healthrecipes.model.Users;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
public UsersMapper mapper;
public UsersService(UsersMapper mapper){
  this.mapper = mapper;
}

public List<Users> searchUsers(){
  return mapper.selectUsers();
}

public Users insertUsers(Users users){
    mapper.insertUsers(users);
    return mapper.selectUsers()

  }
}
