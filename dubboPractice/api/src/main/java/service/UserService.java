package service;

import bean.User;

import java.util.List;

public interface UserService {
    List<User> getUserByName(String name);
}
