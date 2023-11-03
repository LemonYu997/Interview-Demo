package com.example.demo1.controller;

import com.example.demo1.common.R;
import com.example.demo1.common.TableDataInfo;
import com.example.demo1.domain.bo.UserBo;
import com.example.demo1.domain.vo.UserVo;
import com.example.demo1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * TODO 分页查询尚未实现，先返回全部数据
     */
    @GetMapping("/list")
    public TableDataInfo<UserVo> getList() {
        List<UserVo> list = userService.getList();
        return new TableDataInfo<>(list, list.size());
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
