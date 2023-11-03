package com.example.demo1.service;

import com.example.demo1.domain.bo.UserBo;
import com.example.demo1.domain.vo.UserVo;

import java.util.List;

public interface IUserService {
    List<UserVo> getList();

    UserVo getUserById(Long id);

    void add(UserBo userBo);
}
