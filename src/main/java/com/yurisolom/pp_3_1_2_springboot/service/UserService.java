package com.yurisolom.pp_3_1_2_springboot.service;

import com.yurisolom.pp_3_1_2_springboot.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void addUser(User user);

    public User getUser(long id);

    public void updateUser(User user);

    public void deleteUser(User user);

}
