package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> queryUserPage(Integer startRows);

    List<User> selectUserPage(@Param("userName")String userName, @Param("userSex")String userSex, @Param("startRows")Integer startRows);

    Integer getRowCount(@Param("userName")String userName, @Param("userSex")String userSex);

    Integer creatUser(User user);

    Integer deleteUserById(String userId);

    Integer deleteUserByIdList(@Param("list")List userIds);

    Integer updateUserById(User user);
}
