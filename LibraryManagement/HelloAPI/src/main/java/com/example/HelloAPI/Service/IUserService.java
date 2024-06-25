package com.example.HelloAPI.Service;
import com.example.HelloAPI.Model.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();
    User getUserById(int id);
    User createUser(User user);
    User updateUser(int id, User user);
    void deleteUser(int id);
}
