package com.stankor.mvc_hibernate.service;

import com.stankor.mvc_hibernate.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    void saveUser(User user);

    User getUser(long id);

    void deleteUser(long id);

    void updateUser(long id, User updatedUser);
}
