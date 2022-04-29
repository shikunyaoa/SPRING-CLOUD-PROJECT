package com.sky.cloud.controller;

import com.sky.cloud.domain.AjaxResult;
import com.sky.cloud.domain.CommonResult;
import com.sky.cloud.domain.User;
import com.sky.cloud.service.UserService;
import jdk.internal.instrumentation.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author sky
 * @date 2022/4/29
 * @description 用户controller
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public AjaxResult create(@RequestBody User user) {
        userService.create(user);
        return AjaxResult.success("成功");
    }

    @GetMapping("/{id}")
    public AjaxResult<User> getUser(@PathVariable Long id) {
        User user = userService.getUser(id);
        return AjaxResult.success(user);
    }

    @GetMapping("/getUserByIds")
    public AjaxResult<List<User>> getUserByIds(@RequestParam List<Long> ids) {
        List<User> userList= userService.getUserByIds(ids);
        return AjaxResult.success(userList);
    }

    @GetMapping("/getByUsername")
    public AjaxResult<User> getByUsername(@RequestParam String username) {
        User user = userService.getByUsername(username);
        return AjaxResult.success(user);
    }

    @PostMapping("/update")
    public AjaxResult update(@RequestBody User user) {
        userService.update(user);
        return AjaxResult.success("成功");
    }

    @PostMapping("/delete/{id}")
    public AjaxResult delete(@PathVariable Long id) {
        userService.delete(id);
        return AjaxResult.success("成功");
    }
}
