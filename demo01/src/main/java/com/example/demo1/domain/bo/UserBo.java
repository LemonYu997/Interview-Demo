package com.example.demo1.domain.bo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class UserBo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键 id
     */
    private Long userId;

    /**
     * 用户名
     */
    @NotBlank
    @Size(max = 30, message = "用户名长度不能超过30个字符")
    private String username;

    /**
     * 密码
     */
    @NotBlank
    @Size(max = 20, message = "密码长度不能超过20个字符")
    private String password;

    /**
     * 邮箱
     */
    @Email
    @Size(max = 50, message = "邮箱长度不能超过50个字符")
    private String email;

    /**
     * 手机号
     */
    @Size(max = 11, message = "手机号码长度不能超过11个字符")
    private String phone;

    /**
     * 昵称
     */
    @Size(max = 20, message = "昵称长度不能超过20个字符")
    private String nickname;
}
