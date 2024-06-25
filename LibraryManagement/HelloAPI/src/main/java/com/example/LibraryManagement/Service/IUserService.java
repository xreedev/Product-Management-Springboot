package com.example.LibraryManagement.Service;
import com.example.LibraryManagement.Model.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();

    User getUserById(String userId);

    User createUser(User user);
    User updateUser(String  id, User user);
    void deleteUser(String  id);
}
