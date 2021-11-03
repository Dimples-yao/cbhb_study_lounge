package service.impl;

import pojo.User;
import dao.UserDao;
import service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao UserDao;

    @Override
    public int addUser(User user) {
        return UserDao.addUser(user);
    }

    @Override
    public int deleteUserById(int id) {
        return UserDao.deleteUserById(id);
    }

    @Override
    public int updateUser(User user) {
        return UserDao.updateUser(user);
    }

    @Override
    public User queryById(int id) {
        return UserDao.queryById(id);
    }

    @Override
    public List<User> queryAllUser() {
        return UserDao.queryAllUser();
    }

}
