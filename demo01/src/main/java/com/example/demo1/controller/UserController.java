package com.example.demo1.controller;

import com.example.demo1.common.R;
import com.example.demo1.common.TableDataInfo;
import com.example.demo1.domain.bo.UserBo;
import com.example.demo1.domain.vo.UserVo;
import com.example.demo1.service.IUserService;
import com.example.demo1.utils.PageUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 分页查询，并使用缓存
     * 记得要现在启动类上开启缓存
     */
    @GetMapping("/list")
    @Cacheable("userList")
    public TableDataInfo<UserVo> getList() {
        PageUtils.startPage();
        List<UserVo> list = userService.getList();
        return new TableDataInfo<>(list, new PageInfo<>(list).getTotal());
    }

    /**
     * 根据id获取用户信息
     */
    @GetMapping("/{id}")
    public R<UserVo> getUserById(@PathVariable Long id) {
        return R.ok(userService.getUserById(id));
    }

    @PostMapping("/add")
    public R<Void> addUser(@Validated @RequestBody UserBo userBo) {
        userService.add(userBo);
        return R.ok();
    }

}
