package com.sky.cloud.service;

import com.sky.cloud.domain.User;

import java.util.List;

/**
 * @author sky
 * @date 2022/4/29
 * @description
 */
public interface UserService {

    public void create(User user);

    public User getUser(Long id);

    public List<User> getUserByIds(List<Long> ids);

    public User getByUsername(String username);

    public int update(User user);

    public int delete(Long id);
}
