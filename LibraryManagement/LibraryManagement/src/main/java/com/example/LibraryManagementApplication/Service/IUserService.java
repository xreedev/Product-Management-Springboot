package com.example.LibraryApplication.Service;
import com.example.LibraryApplication.Model.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();

    User getUserById(String userId);

    User createUser(User user);
    User updateUser(String  id, User user);
    void deleteUser(String  id);
}
