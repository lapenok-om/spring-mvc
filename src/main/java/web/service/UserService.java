package web.service;

import web.model.User;
import java.util.List;

public interface UserService {
    List<User> getUsers();
    void addUser(User user);
    User detUserById(long id);
    void changeUser(User user);
    void deleteUser(long id);
}
