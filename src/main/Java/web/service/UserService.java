package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void addUser(User user);
    void removeUserById(Integer id);
    void updateUser(User user, int id);
    User getUserById(int id);

}
