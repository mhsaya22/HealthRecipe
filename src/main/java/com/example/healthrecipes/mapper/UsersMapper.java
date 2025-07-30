package com.example.healthrecipes.mapper;

import com.example.healthrecipes.model.Users;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UsersMapper {

  @Select("select * from users")
  List<Users> selectUsers();
  @Insert("insert users(name,email,password)values(#{name},#{email},#{password})")
  int insertUsers(Users users);
}
