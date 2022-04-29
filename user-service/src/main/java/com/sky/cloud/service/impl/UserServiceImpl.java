package com.sky.cloud.service.impl;

import com.sky.cloud.domain.User;
import com.sky.cloud.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sky
 * @date 2022/4/29
 * @description
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void create(User user) {

    }

    @Override
    public User getUser(Long id) {
        User user = new User();
        user.setUsername("测试");
        user.setPassword("123456");
        return user;
    }

    @Override
    public List<User> getUserByIds(List<Long> ids) {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }
}
