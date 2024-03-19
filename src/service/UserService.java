package service;

import model.User;

import java.util.List;

public interface UserService {
    String register();

    String login(String email, int password);

    User getUserByEmail(String email);

    List<User> getAllUsers();
}
