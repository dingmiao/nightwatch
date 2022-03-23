package com.dyc.userservice.mapper;

import com.dyc.userservice.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    User selectByAccountName(String accountName);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}