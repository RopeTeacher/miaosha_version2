package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

/**
 * @Author Rope
 * @Date 2020/6/24 12:07
 * @Version 1.0
 */
public interface UserService {
    //通过id获取用户对象的方法
    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;

    /*
    telephone 是用户注册的手机  password是加密后的密码
    */
    UserModel validateLogin(String telephone,String encrepPassword) throws BusinessException;
}
