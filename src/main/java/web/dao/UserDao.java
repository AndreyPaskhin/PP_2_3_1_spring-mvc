package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> listUsers();
    void add(User user);
    User getUser(Long id);
    void update(Long id, User user);
    void delete(Long id);
}
