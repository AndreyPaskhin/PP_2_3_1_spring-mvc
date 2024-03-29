package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private final UserDao userDao;
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }
    @Transactional
    @Override
    public User show(Long id) {
        return userDao.getUser(id);
    }

    @Transactional
    @Override
    public void update(Long id, User user) {
        userDao.update(id, user);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
}
