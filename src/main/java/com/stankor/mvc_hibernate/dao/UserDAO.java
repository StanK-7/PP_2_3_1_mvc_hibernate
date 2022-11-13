package com.stankor.mvc_hibernate.dao;

import com.stankor.mvc_hibernate.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    void saveUser(User user);

    User getUser(long id);

    void deleteUser(long id);

    void updateUser(long id, User updatedUser);

}
