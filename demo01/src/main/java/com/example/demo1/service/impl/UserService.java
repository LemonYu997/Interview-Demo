package com.example.demo1.service.impl;

import com.example.demo1.common.ServiceException;
import com.example.demo1.domain.User;
import com.example.demo1.domain.bo.UserBo;
import com.example.demo1.domain.vo.UserVo;
import com.example.demo1.mapper.UserMapper;
import com.example.demo1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserVo> getList() {
        return userMapper.selectList();
    }

    @Override
    public UserVo getUserById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public void add(UserBo userBo) {
        checkSameUserName(userBo);
        userMapper.insert(userBo);
    }

    /**
     * 查询要添加的用户是否同名
     */
    public void checkSameUserName(UserBo userBo) {
        int count = userMapper.checkSameUserName(userBo.getUsername());
        if (count > 0) {
            throw new ServiceException("已存在相同用户名");
        }
    }
}
