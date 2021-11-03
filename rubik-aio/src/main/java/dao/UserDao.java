package dao;

import pojo.User;

import java.util.List;

public interface UserDao {
    int addUser(User user);

    int deleteUserById(int id);

    int updateUser(User user);

    User queryById(int id);

    List<User> queryAllUser();
}