package com.example.demo1.mapper;

import com.example.demo1.domain.bo.UserBo;
import com.example.demo1.domain.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 查询用户列表
     */
    List<UserVo> selectList();

    /**
     * 根据id查询用户
     */
    UserVo selectById(@Param("id") Long id);

    /**
     * 查询相同用户名
     */
    int checkSameUserName(@Param("username") String username);

    /**
     * 添加用户
     */
    void insert(UserBo userBo);
}
